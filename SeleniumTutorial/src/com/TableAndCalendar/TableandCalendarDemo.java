package com.TableAndCalendar;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TableandCalendarDemo {
	
	@Test
	public void TableandCalendarDemo() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> ele = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td"));
		int nodes = ele.size();
		for(int i=0;i<nodes;i++){
			String text = ele.get(i).getText();
			System.out.println(text);
		}
		driver.manage().window().maximize();
		driver.quit();
	}
	

}
