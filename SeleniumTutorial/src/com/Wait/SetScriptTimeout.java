package com.Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SetScriptTimeout {
	
	@Test
	public void TestMutipleWindows(){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//Use TimeOuts Interface
		Timeouts timeout = driver.manage().timeouts();
		
		//Use setScriptTimeout is used for asynchronous timeouts
		timeout.setScriptTimeout(5, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
