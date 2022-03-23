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

public class JavaScriptScrollDemo {
	@Test
	public void JavaScriptTypeTest() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		//Type caste Driver to Javascript executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Accepts two params. First to scroll horizontal, second for vertical
		//- value scrolls left and up, + will scroll right and down. 0 value will do nothing
		
		//scrolls down 200 pixels
		//scroll(horizontal,vertical)
		js.executeScript("scroll(0,200)");
		Thread.sleep(3000);
		driver.quit();
	}
}
