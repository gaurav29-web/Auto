package com.ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightAndDoubleClickDemo {

	@Test
	public void TestMutipleWindows(){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap4/bootstrap_dropdowns.asp");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);		
		WebElement ele1 = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		
		//right click on element
		act.contextClick(ele1).build().perform();
		
		//double click
		act.doubleClick(ele1).perform();
		
		driver.quit();
	}
}
