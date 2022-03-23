package com.Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	
	@Test
	public void TestMutipleWindows(){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap4/bootstrap_dropdowns.asp");
		driver.manage().window().maximize();
		WebElement ele1 = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		
		//For explicit wait create object of class WebDriverWait
		WebDriverWait waittime = new WebDriverWait(driver,30);
		
		//Use above object for any conditions on objects
		waittime.until(ExpectedConditions.visibilityOf(ele1));
		if(ele1.isDisplayed()){
			System.out.println("Element exist");
		}
		else{
			System.out.println("Element does not exist");
		}
		driver.quit();
	}

}
