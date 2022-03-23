package com.TestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.LoginPage;
import com.Utility.ExcelDataProvider;

public class MyFirstTestcase extends BaseClass{
	@Test
	public void TestCase1(){
		logger = report.createTest("TestCase1");
		logger.info("STarting application");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.loginApp(excel.getStringVal("Sheet1", 1, 1));
		logger.pass("Test Passed");
		//login.loginApp("TestData");
		
	}
	
	@Test
	public void TestCase2(){
		logger = report.createTest("TestCase2");
		logger.info("STarting application");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.loginApp(excel.getStringVal("Sheet1", 1, 1));
		logger.pass("Test Passed 2");
		//login.loginApp("TestData");
		
	}
}
