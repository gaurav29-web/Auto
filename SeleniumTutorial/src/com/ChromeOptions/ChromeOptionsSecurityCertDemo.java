package com.ChromeOptions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ChromeOptionsSecurityCertDemo {
	@Test
	public void ChromeOptionsTest() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//Add capability to accept SSL certs
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions options = new ChromeOptions();		
		//Merge caps with options
		options.merge(cap);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
}
