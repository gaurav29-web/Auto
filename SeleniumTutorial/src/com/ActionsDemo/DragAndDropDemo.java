package com.ActionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropDemo {

	@Test
	public void DragAndDrop(){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.xpath("//*[@id='drag1']"));
		WebElement dest = driver.findElement(By.xpath("//*[@id='div2']"));
		Actions act = new Actions(driver);	
		
		//Drag and drop in multiple steps steps
		act.clickAndHold(src);
		act.moveToElement(dest);
		act.pause(Duration.ofSeconds(5));
		act.release();
		act.build();
		act.perform();
		
		//Drag and drop in single step --Since only single step so build is not needed
		act.dragAndDrop(src, dest).perform();
		
		//Drag and drop with coordinates
		act.dragAndDropBy(src, 300, 400).perform();
		
		driver.quit();
	}
}
