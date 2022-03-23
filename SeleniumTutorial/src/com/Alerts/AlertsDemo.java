package com.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsDemo {

	@Test
	public void AcceptAlert() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='bookingsForm']/div/div/div[2]/div[3]/button")).click();
		Thread.sleep(3000);
		//Alert is Interface which has predefined methods which has 
		//Switch to command is used to switch to Frame, new window, or alerts
		
		//Create Alert Interface and switch to it otherwise focus will not change
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		//Or use single line code
		//driver.switchTo().alert().accept();
		
		//get text
		driver.findElement(By.xpath("//*[@id='bookingsForm']/div/div/div[2]/div[3]/button")).click();
		Thread.sleep(3000);
		
		String getAltMsg = driver.switchTo().alert().getText();
		System.out.println(getAltMsg);
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
