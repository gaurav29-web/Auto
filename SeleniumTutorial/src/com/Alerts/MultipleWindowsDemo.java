package com.Alerts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowsDemo {
	
	@Test
	public void TestMutipleWindows(){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//Get parent window ID for moving back to parent window in future
		String ParentWinID = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='root']/div[3]/div[3]/div[1]/div[1]/ul/li[1]/a/img")).click();
		
		
		//Get all window ID's. getWindowHandles returns set of values
		Set<String> allWindows = driver.getWindowHandles();
		
		int winCnt = allWindows.size();
		
		for(String childID:allWindows ){
			if(!ParentWinID.equalsIgnoreCase(childID)){
				driver.switchTo().window(childID);
				
				//Perform any operation by fetching elements from child window
			}
		}
		
		//Since by set we can not directly get value. We can convert it to ArrayList. 
		ArrayList<String> arrList = new ArrayList<>(allWindows);
		arrList.get(0);
		
		
		//Switches to tab 0
		driver.switchTo().window(arrList.get(0));
		
		
	}

}
