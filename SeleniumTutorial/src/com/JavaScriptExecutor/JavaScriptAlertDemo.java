package com.JavaScriptExecutor;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptAlertDemo {
	@Test
	public void JavaScriptClickTest() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Type caste Driver to Javascript executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("alert('welcome to Selenium')");
		
		driver.quit();
	}
}
