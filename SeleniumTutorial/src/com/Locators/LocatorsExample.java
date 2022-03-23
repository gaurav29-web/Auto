package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Web Element is a interface which represents elements on web Page
		
		//Find Element by ID
	//	WebElement ele1 = driver.findElement(By.id("u_0_f"));
		
		//By is a class in selenium used for getting locator values
		
		WebElement ele2 = driver.findElement(By.name("login"));
		
		//className will not be unique always
	//	WebElement ele3 = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
		
		//Xpath
	//	WebElement ele4 = driver.findElement(By.xpath("//*[@id='u_0_f']"));
		
		
		//CSS Selector
	//	WebElement ele5 = driver.findElement(By.cssSelector("#u_0_f"));
		
		//Link text
		WebElement ele6 = driver.findElement(By.linkText("Add Account"));
		
		//Partial linktext
		WebElement ele7 = driver.findElement(By.partialLinkText("Account"));
		
		//TagName -- Returns first image on page
		WebElement ele8 = driver.findElement(By.tagName("img"));
		
		//TagName -- Returns list of images on page
				List<WebElement> ele9 = driver.findElements(By.tagName("img"));
				System.out.println(ele9.size());
	}

}
