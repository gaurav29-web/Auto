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

public class JavaScriptTypeDemo {
	@Test
	public void JavaScriptTypeTest() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input"));
		
		//Type caste Driver to Javascript executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//set value as test
		js.executeScript("arguments[0].value='test'",ele);
		
		//Same operation as above with multiple aruguemnts
		js.executeScript("arguments[0].value=arguments[1]",ele,"test");		
		driver.quit();
	}
}
