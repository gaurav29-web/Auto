package com.RestPackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredOAuth extends BaseClass{

	@Test
	public void Test1(){
		 Response resp= RestAssured.given().auth().oauth("", "", "", "").post("Twitter URL and message");
		 int statuscode = resp.statusCode(); 
		System.out.println(statuscode);
		
		//To see json body in good format like JSON viewer use prettify
		System.out.println(resp.getBody().jsonPath().prettify());
		
		//OAth2
		Response resp1= RestAssured.given().auth().oauth2("").post("Twitter URL and message");
		 int statuscode1 = resp1.statusCode(); 
		System.out.println(statuscode1);
	}
}
