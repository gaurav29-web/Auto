package com.HiddenElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenElementsDemo {
	@Test
	public void HiddenElementsTest() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//*[@id='main']/div[7]/div[1]/div/a"));
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		
		//If x and y are 0 means object is hidden
		if(x!=0 && y!=0){
			System.out.println("Object is not hidded");
			ele.click();
		}
		driver.quit();
	}
}
