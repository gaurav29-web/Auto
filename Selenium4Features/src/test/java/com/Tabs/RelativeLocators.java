package com.Tabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RelativeLocators {

	@Test
	public void MultiTabs(){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver ldriver = new ChromeDriver();
		ldriver.manage().window().maximize();
		ldriver.get("https://www.w3schools.com/");
		String parenthandle = ldriver.getWindowHandle();
		WebDriver newTab = ldriver.switchTo().newWindow(WindowType.TAB);
		newTab.get("https://www.google.com/");
		String childhandle = newTab.getWindowHandle();
		newTab.close();
		
		//In order to go back we need to switch to window using window handle
		ldriver.switchTo().window(parenthandle);
	}
}
