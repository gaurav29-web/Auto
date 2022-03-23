package com.TestNGDemo;

import org.testng.annotations.Test;

public class FirstTestNGDemo {
	
	@Test(priority=2, description="This is first test")
	public void TestNGDemo(){
		
		//TestNG is framework inspired by JUnit, Used for unit testing framework. Generates better reports
		//Advantages- Annotations, Reporting, RUns tests in Thread pool, Data Driven Framework using @DataProvider, supports parameters, TestSuite,
		//Supports- Eclipse, InteliJ, Net Beans. Test Groupings
		
		//Tests by default run in alphabetic order of test name. One can use Priority to schedule test sequence
		//Description adds info in report
		
		//TestNG supports negative priority as well. Negative one runs first
		//Installation can be done from Eclipse market place
		
		System.out.println("First Test");
	}
	
	@Test(priority=1, description="Second test")
	public void TestNGSecond(){
		System.out.println("Second Test");
	}
	
	@Test(priority=-1, description="Third test")
	public void TestNGThird(){
		System.out.println("Third Test");
	}

}
