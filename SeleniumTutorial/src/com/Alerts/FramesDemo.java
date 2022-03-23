package com.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesDemo {
	
	@Test
	public void TestFrames(){
		//IFrames are similar to frames. They are HTML document embedded inside another HTML document. Often used to insert content from other source like ads
		//switching to Iframes can be done using Name or ID, index and Web Element
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame("w3c");
		
		//Further proceed with normal element identification and operation. Once you are on frame you can not work on parent page
		
		//Back to parent page
		driver.switchTo().defaultContent();
		
		//Total frames in app
		
		int totalFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(totalFrames);
		
		
	}

}
