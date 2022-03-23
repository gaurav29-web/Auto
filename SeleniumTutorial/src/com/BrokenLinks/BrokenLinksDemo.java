package com.BrokenLinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BrokenLinksDemo {
	@Test
	public void BrokenLinksTest() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(int i=0;i<allLinks.size();i++){
			WebElement ele = allLinks.get(i);
			String url = ele.getAttribute("href");
			
			//STart verifying URL
			URL Acturl = new URL(url);
			HttpsURLConnection httpConn = (HttpsURLConnection)Acturl.openConnection();
			httpConn.setConnectTimeout(3000);
			httpConn.connect();
			if(httpConn.getResponseCode()==200){
				System.out.println("Successful response code");
			}
			else{
				System.out.println("Connection failed for URL== " +url );
			}
		}
		driver.quit();
	}
}
