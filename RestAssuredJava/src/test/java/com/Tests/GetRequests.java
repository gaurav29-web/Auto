package com.Tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequests {
	
	@Test
	public void GetTest(){
		
		//Specify base URI
		RestAssured.baseURI = "https://reqres.in/api/users?page=1";
		
		//Set request object using request specification
		RequestSpecification req = RestAssured.given();
		
		//Create response object
		Response resp = req.request(Method.GET);
		
		//Print response
		System.out.println(resp.getBody().asString());
		
		System.out.println(resp.getStatusCode());
	}

}
