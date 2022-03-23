package com.Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageTimeOuts {
	
	@Test
	public void TestMutipleWindows(){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//Use TimeOuts class
		Timeouts timeout = driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//Use PageLoadTimeout - Waits for pageload for specific time before throwing error
		timeout.pageLoadTimeout(5, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
