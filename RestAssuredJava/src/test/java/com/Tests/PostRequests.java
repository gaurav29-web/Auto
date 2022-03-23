package com.Tests;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequests {
	
	@SuppressWarnings("unchecked")
	@Test
	public void PostTest(){
		
		//Specify base URI
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		//Set JSON input body
		JSONObject json = new JSONObject();
		json.put("name", "morpheus");
		json.put("job", "leader");
		
		//Set request object using request specification
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type","application/json").contentType("application/json").body(json.toJSONString());
		
		//Create response object
		Response resp = req.request(Method.POST);
		//Response resp = req.request(Method.POST,"/anyendpointpath"); -- to append any path to base URI
		//Print response
		System.out.println(resp.getBody().asString());
		
		System.out.println(resp.getStatusCode());
		//System.out.println(resp.jsonPath().get("name")); //-- To get response data
		
	}

}
