package com.RestPackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestAssuredAuth extends BaseClass{

	@Test
	public void Test1(){
		//int statuscode = RestAssured.given().auth().preemptive().basic("test", "test").when().get("https://reqres.in/api/users?page=1").getStatusCode();
		
		
		//Using base class
		int statuscode = RestAssured.given().get("https://reqres.in/api/users?page=1").getStatusCode();
		System.out.println(statuscode);
	}
}
