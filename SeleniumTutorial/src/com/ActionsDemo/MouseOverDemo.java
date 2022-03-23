package com.ActionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverDemo {

	@Test
	public void MouseOverTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement tv = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[2]"));
		Actions act = new Actions(driver);	
		act.moveToElement(tv).perform();
		
		driver.quit();
	}
}
