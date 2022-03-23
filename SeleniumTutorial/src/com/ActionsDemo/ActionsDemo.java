package com.ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemo {

	@Test
	public void TestMutipleWindows(){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap4/bootstrap_dropdowns.asp");
		driver.manage().window().maximize();
		
		//contains al keyborad and mouse buttons
		//Actions single step can work without perform
		
		//more than one event first build and then call perform
		Actions act = new Actions(driver);
		act.click().build().perform();
		
		WebElement ele1 = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
	}
}
