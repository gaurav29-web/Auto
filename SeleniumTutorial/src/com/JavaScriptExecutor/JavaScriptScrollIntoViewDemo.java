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

public class JavaScriptScrollIntoViewDemo {
	@Test
	public void JavaScriptTypeTest() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//*[@id='main']/div[7]/div[1]/div/a"));
		//Type caste Driver to Javascript executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Helps scroll till any element is visible. Used when there are multiple scrollars
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		Thread.sleep(3000);
		driver.quit();
	}
}
