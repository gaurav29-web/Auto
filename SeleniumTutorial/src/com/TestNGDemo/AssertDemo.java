package com.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	//Two assert- Hard and soft assert. Test1 to Test5 are Hard asserts, when assert fails, test stops and is marked as fail. 
	//Soft assert will not stop and will continue but will fail test case
	//testNG.org for all documentation of TestNG
	//To create TestNG XML file- right click on class-->TestNG-->Convert to TestNG. XML file is generated. add all test cases in xml file
	//Report is created in Test-Output by name of suite name passed in TestNG file
	@Test()
	public void Test1(){
		Assert.assertEquals(12, 13);
	}
	
	@Test
	public void Test2(){
		Assert.assertEquals(12, 12,"Count match");	
		//Message in assert is only displayed in console when assert fails
		Assert.assertEquals(12, 13,"Count mismatch");			
	}
	
	@Test
	public void Test3(){
		Assert.assertEquals(12, 12,"Count match");		
	}
	
	@Test
	public void Test4(){
		Assert.assertTrue(true);		
	}
	
	@Test
	public void Test5(){
		Assert.assertTrue(false,"Condition failed in method");	
	}
	
	@Test
	public void Test6(){
		//Create object of softAssert
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(12, 13,"Count mismacth");
		System.out.println("Test continues after test fail");
		//Until we call assertAll assertion is not executed. Use this in last of test, any code after this code will not be executed since assert gets executed
		assertion.assertAll();
		
	}
}
