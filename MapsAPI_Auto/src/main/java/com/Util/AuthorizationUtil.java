package com.Util;

import java.time.LocalTime;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

import com.Extensions.RestAssuredExtension;

import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

public class AuthorizationUtil {
	private static Logger _log=LogManager.getLogger(AuthorizationUtil.class);
	
	public static String AUTH_TOKEN;
	public static int TOKEN_EXP_VALUE=15;
	public static LocalTime TOKEN_EXP_TIME;
	
	public static HashMap<String,String> uriTokenHash = new HashMap<>();
	public static HashMap<String,LocalTime> tokenExpirationHashMap = new HashMap<>();
	
	public static boolean AUTH_REQUIRED=false;
	public static String API_USERNAME;
	public static String API_PASSWORD;
	public static final String HEADER_AUTH_KEY="Authorization";
	
	public static final String JSON_KEY_TOKEN="token";
	public static final String JSON_KEY_TOKEN_EXP="expireTime";
	
	public static String getURITokenKey(String inURI){
		if(inURI !=null){
			int endIndex = inURI.indexOf(".optum.com/");
			String key = (endIndex>0) ? inURI.substring(0,endIndex+11) :inURI;
			return key;
		}
		return "";
	}
	
	public static void GenerateToken(){
		String uri=BuildParameters.GetBaseURI();
		GenerateToken(uri);
		AUTH_TOKEN= uriTokenHash.get(uri);
		TOKEN_EXP_TIME= tokenExpirationHashMap.get(AUTH_TOKEN);
	}
	public static void GenerateToken(String inURI){
		try{
			if(AUTH_REQUIRED){
				String uri = inURI.replace("api/maps", "api/user/login");
				_log.info(String.format("URI for login API: %s", uri));
				RestAssuredExtension extension = new RestAssuredExtension(uri);
				extension.setTestApicall(false);
				JSONObject jObject = new JSONObject();
				jObject.put("username", API_USERNAME);
				jObject.put("password", API_PASSWORD);
				_log.info(String.format("Logging into environment %s with user %s", BuildParameters.GetEnvironment(),API_USERNAME));
				extension.SetBody(jObject);
				ResponseOptions<Response> response = extension.PostOperation();
				if(null!=response){
					JSONObject jresponse = new JSONObject(response.body().asString());
					if(jresponse.has(JSON_KEY_TOKEN_EXP)){
						TOKEN_EXP_VALUE= jresponse.getInt(JSON_KEY_TOKEN_EXP);
					}
					
					String token = jresponse.getString(JSON_KEY_TOKEN);
					_log.info(String.format("Auth token generated for %s", API_USERNAME));
					
					uriTokenHash.put(inURI, token);
					LocalTime myObj = LocalTime.now();
					tokenExpirationHashMap.put(token, myObj.plusMinutes(TOKEN_EXP_VALUE));
				}		
			}
		}
		catch(Exception e){
			_log.error(e.getMessage());
		}
	}
	
	public static boolean IsTokenExpired(){
		String token = uriTokenHash.get(BuildParameters.GetBaseURI());
		return IsTokenExpired(token);
	}
	
	public static boolean IsTokenExpired(String inToken){
		LocalTime exp = tokenExpirationHashMap.get(inToken);
		if(null!=exp){
			return LocalTime.now().isAfter(exp.minusMinutes(1));
		}
		return true;
	}
	
	public static String GetBearerToken(){
		return String.format("Bearer %s", AUTH_TOKEN);
	}
	
	public static String GetBearerToken(String inURI){
		String token = uriTokenHash.get(inURI);
		return String.format("Bearer %s", AUTH_TOKEN);
	}
	
	
}
