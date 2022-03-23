package com.RestPackage;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Delete_Tests {

	@Test
	public void PostOps(){
		
		//Create Request specification 
		RequestSpecification req =RestAssured.given();
		
		//add headers for POST request
		req.header("Content-Type","application/json");
		
		//JSON object to add request JSON body
		JSONObject json = new JSONObject();
		json.put("name", "morpheus");
		json.put("job", "leader");
		
		//add body params
		req.body(json.toJSONString());
		
		Response res =req.post("https://reqres.in/api/users");
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
	}
	
	@Test
	public void DeleteOps(){
		RequestSpecification req =RestAssured.given();		
		Response res =req.delete("https://reqres.in/api/users/2");
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
	}
	
	@Test
	public void PutOps(){
		RequestSpecification req =RestAssured.given();
		req.header("Content-Type","application/json");
		
		JSONObject json = new JSONObject();
		json.put("name", "morpheus");
		//update data
		json.put("job", "Test123");
		
		req.body(json.toJSONString());
		
		Response res =req.put("https://reqres.in/api/users");
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
	}
}
