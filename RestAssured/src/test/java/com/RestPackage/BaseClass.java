package com.RestPackage;

import org.junit.Before;

import io.restassured.RestAssured;

public class BaseClass {

	@Before
	public void setup(){
		RestAssured.authentication = RestAssured.preemptive().basic("test", "test");
	}
}
