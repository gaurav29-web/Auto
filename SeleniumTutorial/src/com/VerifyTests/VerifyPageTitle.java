package com.VerifyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPageTitle {
	
	@Test
	public void VerifyPageTitleInSelenium() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
