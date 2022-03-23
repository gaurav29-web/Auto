package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Single attribute
	/*	WebElement ele1 = driver.findElement(By.xpath("//button[@name='login']"));
		ele1.click();
		*/
		//multiple attribute
		/*WebElement ele2 = driver.findElement(By.xpath("//button[@name='login'][@value='1']"));
		ele2.click();*/
		
		//AND condition attribute
		/*WebElement ele3 = driver.findElement(By.xpath("//button[@name='login'] and [@value='1']"));
		ele3.click();*/
				
		//OR condition attribute
	/*	WebElement ele4 = driver.findElement(By.xpath("//button[@name='login'] or [@value='1']"));
		ele4.click();*/
		
		//contains keyword with AND operator
		WebElement ele5 = driver.findElement(By.xpath("//*[contains(@name,'login') and @type='submit']"));
		ele5.click();

		

	}

}
