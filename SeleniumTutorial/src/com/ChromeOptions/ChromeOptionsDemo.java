package com.ChromeOptions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ChromeOptionsDemo {
	@Test
	public void ChromeOptionsTest() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		
		//Desired caps class is very important for many concepts like cert accept, Selenium Grid
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		
		ChromeOptions options = new ChromeOptions();
		//add extension while running test
		//options.addExtensions(new File("path of extention from machine"));
		
		//disable inforbar
		options.addArguments("--disable-infobars");
		
		//Run chrome in headless mode
		/*options.addArguments("--headless");
		options.addArguments("--disable-gpu");*/
		
		//second option for headless
		options.setHeadless(true);
		
		//accept insecure certificate to run sites without secure certificate
		options.setAcceptInsecureCerts(true);
		
		//Merge caps with options
		options.merge(cap);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
}
