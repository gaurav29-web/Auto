package com.Log4j;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jDemo {
	@Test
	public void Log4jDemoTest() throws IOException, InterruptedException{
		
		//Get logger object with class name
		Logger log = Logger.getLogger("Log4jDemo");
		
		//Set conguration file created for properties files
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//*[@id='main']/div[7]/div[1]/div/a"));
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		log.info("Got X and Y cordinates");
		//If x and y are 0 means object is hidden
		if(x!=0 && y!=0){
			System.out.println("Object is not hidded");
			ele.click();
			log.info("clicked x y cordinates");
		}
		driver.quit();
		log.info("quit browser");
	}
}
