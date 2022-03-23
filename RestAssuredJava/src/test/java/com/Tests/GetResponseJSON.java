package com.Tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetResponseJSON {
	
	@Test
	public void GetHeaderTest(){
		
		//Specify base URI
		RestAssured.baseURI = "https://reqres.in/api/users?page=1";
		
		//Set request object using request specification
		RequestSpecification req = RestAssured.given();
		
		//Create response object
		Response resp = req.request(Method.GET);
		
		JsonPath jsonpath = resp.jsonPath();
		System.out.println(resp.getBody().asString());
		System.out.println(jsonpath.get("data[0].email")); //Fetch JSON path using JSONPathFinder chrome extension		
	}
}
