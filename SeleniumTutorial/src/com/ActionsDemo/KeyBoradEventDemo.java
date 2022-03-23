package com.ActionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoradEventDemo {

	@Test
	public void KeyBoradEvent(){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		WebElement pass = driver.findElement(By.xpath("//*[@id='pass']"));
		Actions act = new Actions(driver);	
		//enter in caps
		act.moveToElement(email).keyDown(Keys.SHIFT).sendKeys("abc").build().perform();
	//	email.sendKeys("abc");
		pass.sendKeys("abc");
		//Keys is enum that has all keys operation
		act.sendKeys(Keys.ENTER);
		
		driver.quit();
	}
}
