package com.TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserDemo {
	WebDriver driver;
	
	//Create driver as global and add parameters in test case and test NG xml file as well. Create multiple test suites in TestNG xml.
	//To run in parallel mark suite as parallel="tests"
	@Test
	@Parameters("browser")
	public void VerifyPageTitleInSelenium(String browserName) throws InterruptedException{
		if(browserName.equalsIgnoreCase("FIREFOX")){
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("CHROME")){
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Automation\\IEDriverServer_x64_3.141.59\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get("https://www.w3schools.com/bootstrap4/bootstrap_dropdowns.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String getActTitle = driver.getTitle();
	
		Assert.assertTrue(getActTitle.equalsIgnoreCase("Bootstrap 4 Dropdowns"), "Verified title");
		
		//can be verified through page source as well
		String str_PageSrc = driver.getPageSource().toString();
		Assert.assertTrue(str_PageSrc.contains(getActTitle), "Verified title using page source");
		
		driver.quit();

}
}