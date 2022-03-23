package com.Tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class TestTabs {

	@Test
	public void MultiTabs(){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver ldriver = new ChromeDriver();
		ldriver.manage().window().maximize();
		ldriver.get("https://www.w3schools.com/");
		WebElement ele1 = ldriver.findElement(By.xpath("//*[@id='mySidenav']/div/a[2]"));
		ldriver.findElement(RelativeLocator.withTagName("a").above(ele1));
		
		ldriver.findElement(RelativeLocator.withTagName("a").above(ele1).toLeftOf(ele1));
	}
}
