/*package com.Wait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FluentWaitDemo {
	
	@Test
	public void TestMutipleWindows(){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap4/bootstrap_dropdowns.asp");
		driver.manage().window().maximize();
		
		
		//Default polling time/period is 250 milliseconds. You can change the default timeout in fluent wait
		//Fluet wait is class org.openqa.selenium.support.ui
		//Implementation of wait interface
		//We can pass time with frequency
		//We can ignore exception while poling exception like NoSuchElement found
		
		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(1,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		WebElement ele = wait.until(new Function<WebDriver,WebElement>()
				{
					public WebElement apply(WebDriver driver){
						WebElement ele1 = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
						if(ele1.isDisplayed()){
							System.out.println("Element exist");
						}
						else{
							System.out.println("Element does not exist");
						}
					}
				}
		
		
}
}*/