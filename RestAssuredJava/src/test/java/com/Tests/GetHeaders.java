package com.Tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetHeaders {
	
	@Test
	public void GetHeaderTest(){
		
		//Specify base URI
		RestAssured.baseURI = "https://reqres.in/api/users?page=1";
		
		//Basic Auth
		PreemptiveBasicAuthScheme auth = new PreemptiveBasicAuthScheme();
		auth.setUserName("abc");
		auth.setPassword("test123");
		RestAssured.authentication = auth;
		
		//Set request object using request specification
		RequestSpecification req = RestAssured.given();
		
		//Create response object
		Response resp = req.request(Method.GET);
		
		//Get all headers. 
		Headers headers = resp.headers();
		
		//Print response bu using Header class in RestAssured
		for(Header header: headers){
			System.out.print(header.getName() + " ");
			System.out.println(header.getValue());
		}
	}

}
