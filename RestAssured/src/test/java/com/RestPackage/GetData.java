package com.RestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	@Test
	public void TestResponseCode(){
		//Response is interface from rest assured
		Response resp = RestAssured.get("https://reqres.in/api/users?page=1");
		System.out.println(resp.statusCode());
		Assert.assertEquals(resp.statusCode(),200);
		System.out.println("Response time === "+ resp.getTime());
		String data = resp.asString();
		System.out.println("Complete data is === "+ data);
	}
	
	//changed RestAssured import to static and .* to import all components. Now we will write above code as per rest assured norms
	
	@Test
	public void StandardCode(){
		String uri = "https://reqres.in/api/users?page=1";
		//get directly can be used after static import is done
		int code = get(uri).getStatusCode();
		String data = get(uri).asString();
		long time = get(uri).getTime();
		System.out.println(code);
		System.out.println("Response time === "+ time);
		System.out.println("Complete data is === "+ data);
	}
}
