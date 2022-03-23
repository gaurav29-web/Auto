package com.Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait {
	
	@Test
	public void TestMutipleWindows(){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//Implicit waits are used for elements so use it after get method. It is Global wait(available for all element types), smart wait.
		//Waits till time out. If element found moves next else throws no such Element exception
		
		//Implicit will wait for 10 seconds either element is loaded or not
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='bookingsForm']/div/div/div[2]/div[3]/button"));
		driver.quit();
	}

}
