package com.Model;

import java.util.AbstractMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

import com.Exceptions.UnifiedResponseException;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

public class NSFUnifiedResponseModel {
	
	private Logger _log = LogManager.getLogger(this.getClass());
	private JSONObject _nsfJsonResponse;
	private Object _pathSearchableJson;
	private AbstractMap.SimpleEntry<String, String> _unifiedResponseCode;
	private AbstractMap.SimpleEntry<String, String> _unifiedResponseMessage;
	private AbstractMap.SimpleEntry<String, String> _originalHttpResponseCode;
	private AbstractMap.SimpleEntry<String, String> _internalServiceHttpResponse;
	
	public NSFUnifiedResponseModel(String responseJsonString) throws UnifiedResponseException{
		JSONObject response = new JSONObject(responseJsonString);
		_nsfJsonResponse = response;
		init();
		if(!ValidateResponse(response)){
			throw new UnifiedResponseException("Response is not a valid NSF Unified Response.This could be a result of the client not being able to reach server");
			
		}
	}
	
	public Integer GetUnifiedResponseCode() throws UnifiedResponseException{
		ValidateSearchableJson();
		try{
			return JsonPath.parse(_pathSearchableJson).read(_unifiedResponseCode.getValue(),Integer.class);
		}
		catch(Exception e){
			try{
				return JsonPath.parse(_pathSearchableJson).read("$.UnifiedResponseCode",Integer.class);
			}
			catch(Exception e2){
				throw new UnifiedResponseException(String.format("Can not extract value for %s", _unifiedResponseCode.getKey()),e2); 
			}
		}
	}
	
	public String GetUnifiedResponseMessage() throws UnifiedResponseException{
		ValidateSearchableJson();
		try{
			return JsonPath.read(_pathSearchableJson,_unifiedResponseMessage.getValue());
		}
		catch(Exception e){
			try{
				return JsonPath.read(_pathSearchableJson,"$.UnifiedResponseMessage");
			}
			catch(Exception e2){
				throw new UnifiedResponseException(String.format("Can not extract value for %s", _unifiedResponseMessage.getKey()),e2); 
			}
		}
	}
	
	public Integer GetOriginalHttpResponseCode() throws UnifiedResponseException{
		ValidateSearchableJson();
		try{
			return JsonPath.parse(_pathSearchableJson).read(_originalHttpResponseCode.getValue(),Integer.class);
		}
		catch(Exception e){
			try{
				return JsonPath.parse(_pathSearchableJson).read("$.OriginalHttpResponseCode",Integer.class);
			}
			catch(Exception e2){
				throw new UnifiedResponseException(String.format("Can not extract value for %s", _originalHttpResponseCode.getKey()),e2); 
			}
		}
	}
	
	public Object GetInternalServiceResponse() throws UnifiedResponseException{
		try{
			JSONObject serviceResponse = _nsfJsonResponse.getJSONObject(_internalServiceHttpResponse.getKey());
			return Configuration.defaultConfiguration().jsonProvider().parse(serviceResponse.toString());
		}
		catch(Exception e){
			try{
				JSONObject serviceResponse = _nsfJsonResponse.getJSONObject("internalServiceResponse");
				return Configuration.defaultConfiguration().jsonProvider().parse(serviceResponse.toString());
			}
			catch(Exception e2){
				_log.error("Can not extract the service response",e2);
				return Configuration.defaultConfiguration().jsonProvider().parse("{}");
			}
		}
	}
	
	public JSONObject GetInternalServiceResponseJSON(){
		try{
			return _nsfJsonResponse.getJSONObject(_internalServiceHttpResponse.getKey());
		}
		catch(Exception e){
			try{
				return _nsfJsonResponse.getJSONObject("internalServiceResponse");
			}
			catch(Exception e2){
				_log.error("Can not extract the service response",e2);
				return new JSONObject("{}");
			}
		}
	}
	
	private void init() throws UnifiedResponseException{
		_unifiedResponseCode = new AbstractMap.SimpleEntry<String, String>("UnifiedResponseCode","$.unifiedResponseCode");
		_unifiedResponseMessage = new AbstractMap.SimpleEntry<String, String>("UnifiedResponseMessage","$.unifiedResponseMessage");
		_originalHttpResponseCode = new AbstractMap.SimpleEntry<String, String>("OriginalHttpResponseCode","$.originalHttpResponseCode");
		_internalServiceHttpResponse = new AbstractMap.SimpleEntry<String, String>("InternalServiceHttpResponse","$.internalServiceHttpResponse");
		try{
			_pathSearchableJson =  Configuration.defaultConfiguration().jsonProvider().parse(_nsfJsonResponse.toString());
		}
		catch(Exception e){
			throw new UnifiedResponseException("Can not convert Unified Reponse into searchable JSON object",e);
		}
	}
		
		private boolean ValidateResponse(JSONObject unifiedResponse) throws UnifiedResponseException 
		{
			if(GetUnifiedResponseCode() instanceof Integer && null!=GetUnifiedResponseMessage() && null!=GetInternalServiceResponse())
			{
				return true;
			}
			return false;
		}
		
		private void ValidateSearchableJson() throws UnifiedResponseException {
			if(null==_pathSearchableJson){
				_log.debug("Searchable JSON object is null");
				throw new UnifiedResponseException("Invalid JSON response");
			}
		}
		
		
	}

