package com.SeleniumGridDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SelGridFFRunDemo {
	
	@Test
	public void TestFF() throws InterruptedException, MalformedURLException{
		//Firefox
		DesiredCapabilities capff = DesiredCapabilities.chrome();
		capff.setPlatform(Platform.ANY);
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, capff);
				
	//	System.setProperty("webdriver.gecko.driver", "G:\\\\workspace\\Web_Auto\\Lib\\geckodriver.exe");
		
		driver.get("https://google.com");
		System.out.println("Successfully launched browser through Firefox");
		Thread.sleep(5000);		
		driver.quit();
	}
	
}
