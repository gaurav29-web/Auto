package com.BaseClassDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
WebDriver driver;

@BeforeMethod
public void SetUp(){
	Reporter.log("===========Start Application=============",true);
	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver89\\chromedriver.exe");	
	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/bootstrap4/bootstrap_dropdowns.asp");
	Reporter.log("============Aplication Started===========",true);
}

@AfterMethod
public void closeApp(){
	driver.quit();
}

}
