package com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

public class BrowserFactory {

	public static WebDriver startApplication(WebDriver ldriver, String browserName, String appName){
		if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ldriver = new ChromeDriver();
			ldriver.manage().window().maximize();
			ldriver.get(appName);
			ldriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.firefox.driver", "./Drivers/chromedriver.exe");
			ldriver = new FirefoxDriver();
			ldriver.manage().window().maximize();
			ldriver.get(appName);
			ldriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.iedriver.driver", "./Drivers/chromedriver.exe");
			ldriver = new InternetExplorerDriver();
			ldriver.manage().window().maximize();
			ldriver.get(appName);
			ldriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		}
		else {
			Reporter.log("Invalid browser Name", true);
		}
		return ldriver;
		
	}
	
	public static void quitBrowser(WebDriver ldriver){
		ldriver.quit();
	}
}
