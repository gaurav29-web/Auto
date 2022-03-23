package stepDefinitions;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

import com.Exceptions.ResourceLoaderException;
import com.Extensions.RestAssuredExtension;
import com.Model.NSFUnifiedResponseModel;
import com.Util.APIStatistics;
import com.Util.RuntimeModeUtil;
import com.Utility.ConvertFeatureParamsUtil;
import com.Utility.ResourceLoaderUtil;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
public class AlertsStepDef {
	
	private ResponseOptions<Response> _response =null;
	private RestAssuredExtension _restAssuredExtension;
	private NSFUnifiedResponseModel _unifiedResponseBody=null;
	private String _authToken="", _mockedResponseFileName=null, str_ParamVal, jsonTokenString=null;
	private Map<String, String> _queryParams, _headerParams;
	private Integer _lastInsertedID=null;
	
	
	
	@Given("Step1")
	public void Step1(){
		_restAssuredExtension = new RestAssuredExtension();
		_restAssuredExtension.AddAuthToken();
	}
	
	@When("QueryParams")
	public void QueryParams(DataTable table){
		_queryParams = ConvertFeatureParamsUtil.getParamsFromTableAsMap(table);
		_restAssuredExtension.SetQueryParams(_queryParams);
	}
	
	@When("HeaderParams")
	public void HeaderParams(DataTable table){
		_headerParams = ConvertFeatureParamsUtil.getParamsFromTableAsMap(table);
		_restAssuredExtension.SetHeaderParams(_headerParams);
	}
	
	@When("SetBody")
	public void SetBody(String requestFile) throws ResourceLoaderException{
		ResourceLoaderUtil resLoad = new ResourceLoaderUtil();
		JSONObject requestJson = resLoad.GetJsonFromRequestFolder(requestFile);
		_restAssuredExtension.SetBody(requestJson);
	}
	@When("PostRequest")
	public void PostRequest(String operation, String recordType, int statusCode, int originalHttpResponseCode) throws Exception{
		switch(operation.toUpperCase()){
		case "GET":
			_response = _restAssuredExtension.GetOperation();
			break;
		case "POST":
			_response = _restAssuredExtension.PostOperation();
			break;
		case "UPDATE":
			_response = _restAssuredExtension.UpdateOperation();
			break;
		case "DELETE":
			_response = _restAssuredExtension.DeleteOperation();
			break;
		default:
			return;
		}
		
		int tmpStatusCode = _response.getStatusCode();
		try{
			_unifiedResponseBody=new NSFUnifiedResponseModel(_response.body().asString());
			assertEquals(originalHttpResponseCode,(int)_unifiedResponseBody.GetOriginalHttpResponseCode());
		}
		catch(Exception e){}
	}
	
	@Then("VerifyResponse")
	public void VerifyResponse(String elementName, String elementVal){
		Object json = _unifiedResponseBody.GetInternalServiceResponse();
		String elementValue = JsonPath.<String>read(json,String.format("$.%s", elementName));
		assertEquals(elementVal,elementValue);
	}
}
