package com.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Utility.BrowserFactory;
import com.Utility.ConfigFileReader;
import com.Utility.ExcelDataProvider;
import com.Utility.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
 public WebDriver driver;
 public ExcelDataProvider excel;
 public ConfigFileReader config;
 public ExtentReports report;
 public ExtentTest logger;
 
 
 @BeforeSuite
 public void setupSuite(){
	 excel = new ExcelDataProvider();
	 config = new ConfigFileReader();
	 ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/rep"+Helper.getCurrentDateTime()+".html"));
	 report = new ExtentReports();
	 report.attachReporter(extent);
	 Reporter.log("Executed SetUpSuite",true);
 }
 
 	//@Parameters({"browser","url"})
	@BeforeTest
	public void setup(){
	//public void setup(String browser, String testURL){
		driver = BrowserFactory.startApplication(driver, config.browserPath(), config.URLPath());
	//	driver = BrowserFactory.startApplication(driver, browser, testURL);
	}
	
	@AfterTest
	public void tearDown(){
		BrowserFactory.quitBrowser(driver);		
	}
	
	@AfterMethod
	public void tearAfterMethod(ITestResult result) throws IOException{
		//if(result.getStatus()==ITestResult.FAILURE){
			Helper.captureSCreenShot(driver);
			logger.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureSCreenShot(driver)).build());
	//	}
		report.flush();
	}
}
