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

public class JavaScriptClickDemo {
	@Test
	public void JavaScriptTypeTest() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]"));
		
		//Type caste Driver to Javascript executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Used to click element when Normal click does not work. Clicks even on disabled controls. 
		//Disadvantage at times button may be disabled as per bug but it will still click
		//Clicks on element through DOM since Javascript is able to access DOM
		//One way to click using Java script
		//js.executeScript("document.getElementByID('btnK').click");
		
		//Second way to click- using Xpath
		js.executeScript("arguments[0].click()", ele);
		driver.quit();
	}
}
