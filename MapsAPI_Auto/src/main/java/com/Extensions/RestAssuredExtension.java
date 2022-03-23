package com.Extensions;

import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

import com.Exceptions.APIResponseException;
import com.Util.APIStatistics;
import com.Util.AuthorizationUtil;
import com.Util.BuildParameters;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class RestAssuredExtension {
	public RequestSpecification Request;
	private ResponseOptions<Response> _response;
	private Logger _log = LogManager.getLogger(RestAssuredExtension.class);
	public String _mockedResponseFileName = null;
	private JSONObject _requestJSON = null;
	private boolean _isTestApiCall=true;
	
	public boolean responseIsMocked(){
		if(_mockedResponseFileName!=null) return true;
		return false;
	}
	
	public RestAssuredExtension(){
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri(BuildParameters.GetBaseURI());
		if(BuildParameters.IsDebugMode()){
			_log.info(String.format("Base URI: %s", BuildParameters.BASE_URI));
		}
		builder.setContentType(ContentType.JSON);
		builder.setRelaxedHTTPSValidation();
		RequestSpecification requestSpec = builder.build();
		Request = RestAssured.given().spec(requestSpec);
	}
	
	public RestAssuredExtension(String baseuri) throws URISyntaxException{
		URI uri = new URI(baseuri);
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri(uri);
		if(BuildParameters.IsDebugMode()){
			_log.info(String.format("Base URI: %s", BuildParameters.BASE_URI));
		}
		builder.setContentType(ContentType.JSON);
		builder.setRelaxedHTTPSValidation();
		RequestSpecification requestSpec = builder.build();
		Request = RestAssured.given().spec(requestSpec);
	}
	
	public void AddAuthToken(){
		if(AuthorizationUtil.AUTH_REQUIRED){
			if(AuthorizationUtil.IsTokenExpired()){
				_log.info("Auth token expired. Regenerating the token");
				AuthorizationUtil.GenerateToken();
			}
			Request.header(AuthorizationUtil.HEADER_AUTH_KEY,AuthorizationUtil.GetBearerToken());
		}
	}
	
	public void AddAuthToken(String uri){
		if(AuthorizationUtil.AUTH_REQUIRED){
			String token = AuthorizationUtil.uriTokenHash.get(uri);
			if(AuthorizationUtil.IsTokenExpired(token)){
				_log.info("Auth token expired. Regenerating the token");
				AuthorizationUtil.GenerateToken(uri);
			}
			Request.header(AuthorizationUtil.HEADER_AUTH_KEY,AuthorizationUtil.GetBearerToken(uri));
		}
	}
	
	public ResponseOptions<Response> GetOperation() throws Exception{
		_response = Request.get();
		return ProcessResponseAndReturn();
	}
	
	public ResponseOptions<Response> PostOperation() throws Exception{
		_response = Request.post();
		return ProcessResponseAndReturn();
	}
	
	public ResponseOptions<Response> GetOperation(String url) throws Exception{
		_response = Request.get(new URI(url));
		return ProcessResponseAndReturn();
	}
	
	public ResponseOptions<Response> GetOperationWithPathParams(String url, Map<String,String> pathParams) throws Exception{
		SetPathParams(pathParams);
		_response = Request.get(url);
		return ProcessResponseAndReturn();
	}
	
	public ResponseOptions<Response> GetOperationWithQueryParams(String url, Map<String,String> queryParams) throws Exception{
		SetQueryParams(queryParams);
		_response = Request.get(url);
		return ProcessResponseAndReturn();
	}
	
	public ResponseOptions<Response> GetOperationWithQueryParams(Map<String,String> queryParams) throws Exception{
		SetQueryParams(queryParams);
		_response = Request.get();
		return ProcessResponseAndReturn();
	}
	
	public ResponseOptions<Response> GetOperationWithHeaderParams(Map<String,String> headerParams) throws Exception{
		SetHeaderParams(headerParams);
		_response = Request.get();
		return ProcessResponseAndReturn();
	}
	
	public ResponseOptions<Response> DeleteOperation() throws Exception{
		_response = Request.delete();
		return ProcessResponseAndReturn();
	}
	
	public ResponseOptions<Response> UpdateOperation() throws Exception{
		_response = Request.post();
		return ProcessResponseAndReturn();
	}
	
	public void SetQueryParams(Map<String,String> queryParams){
		Request.queryParams(queryParams);
	}
	
	public void SetQueryParams(Map<String,String> queryParams,HashMap persistedData){
		if(queryParams.containsKey("mock")){
			_mockedResponseFileName=queryParams.get("mock");
			queryParams.remove("mock");
		}
		else _mockedResponseFileName=null;
		
		String key="",persistedKey="", headerVal="",replacementVal="";
		for(String headerKey: queryParams.keySet()){
			headerVal = queryParams.get(headerKey).toString();
			if(headerVal.startsWith("%%")){
				persistedKey = headerVal.substring(2);
				try{
					replacementVal = persistedData.get(persistedKey).toString();
					if(replacementVal !=null) queryParams.put(headerKey, replacementVal);		
				}
				catch(Exception e){}
			}
		}
		Request.queryParams(queryParams);
	}
	
	public void SetHeaderParams(Map<String, String> headerParams){
		if(headerParams.containsKey("mock")){
			_mockedResponseFileName=headerParams.get("mock");
			headerParams.remove("mock");
		}
		headerParams.put("identity", BuildParameters.TEST_IDENTITY);
		Request.headers(headerParams);
	}
	
	public void SetHeaderParams(Map<String,String> headerParams,HashMap persistedData){
		if(headerParams.containsKey("mock")){
			_mockedResponseFileName=headerParams.get("mock");
			headerParams.remove("mock");
		}
		else _mockedResponseFileName=null;
		
		String key="",persistedKey="", headerVal="",replacementVal="";
		for(String headerKey: headerParams.keySet()){
			headerVal = headerParams.get(headerKey).toString();
			if(headerVal.startsWith("%%")){
				persistedKey = headerVal.substring(2);
				try{
					replacementVal = persistedData.get(persistedKey).toString();
					if(replacementVal !=null) headerParams.put(headerKey, replacementVal);		
				}
				catch(Exception e){}
			}
		}
		Request.headers(headerParams);
	}
	
	public void SetBody(JSONObject json){
		_requestJSON=json;
		Request.body(json.toString());
	}
	
	public JSONObject GetRequestJSON(){
		return _requestJSON;
	}
	
	public void SetBody(InputStream stream){
		Request.body(stream);
	}
	
	public void SetBody(String bodyAsString){
		Request.body(bodyAsString);
	}
	
	public void SetBodyField(String fieldName,String fieldValue){
		_requestJSON.put(fieldName, fieldValue);
		Request.body(_requestJSON.toString());
	}
	
	public void SetBodyField(String fieldName,Integer fieldValue){
		_requestJSON.put(fieldName, fieldValue);
		Request.body(_requestJSON.toString());
	}
	
	public boolean isTestApiCall(){
		return _isTestApiCall;
	}
	
	public void setTestApicall(boolean _isTestApiCall){
		this._isTestApiCall=_isTestApiCall;
	}
	
	private ResponseOptions<Response> ProcessResponseAndReturn() throws APIResponseException{
		CheckStatusAdPrintError();
		if(null==_response){
			throw IncrementAPIHitCountAndCreateException();
		}
		
		if(BuildParameters.IsDebugMode() && _response!=null){
			_log.debug(_response.body().prettyPrint());
		}
		return IncrementAPIHitCountAndCreateException(_response);
	}
	
	private void SetPathParams(Map<String, String> pathParams){
		Request.pathParams(pathParams);
	}
	
	private ResponseOptions<Response> IncrementAPIHitCountAndCreateException(ResponseOptions<Response> response){
		if(isTestApiCall()){
			APIStatistics.API_HIT_Count++;
		}
		return response;
	}
	
	private APIResponseException IncrementAPIHitCountAndCreateException(){
		if(isTestApiCall()){
			APIStatistics.API_HIT_Count++;
		}
		return new APIResponseException("Response is null");
	}
	
	private void CheckStatusAdPrintError(){
		if(null !=_response && _response.statusCode()!=200){
			_log.error(_response.statusLine());
			_log.error(_response.body().asString());
		}
	}
}
