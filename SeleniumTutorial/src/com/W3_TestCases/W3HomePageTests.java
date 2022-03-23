package com.W3_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.w3Pages_POM.W3_HomePage;
import com.w3Pages_POM.W3_HomePage_PageFactory;

public class W3HomePageTests {

	@Test
	public void HomePage(){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		W3_HomePage log = new W3_HomePage(driver);
		log.login();
		driver.quit();
	}
		
		//Page factory test case
		@Test
		public void HomePage_PageFactory(){
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/");
			driver.manage().window().maximize();
			W3_HomePage_PageFactory LoginPageFac = PageFactory.initElements(driver, W3_HomePage_PageFactory.class);
			LoginPageFac.clickLogin();
			driver.quit();
	}
}
