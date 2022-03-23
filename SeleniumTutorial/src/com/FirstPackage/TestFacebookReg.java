package com.FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookReg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//using chrome
		/*System.setProperty("webdriver.chrome.driver", "C:\\\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		//using firefox
		/*System.setProperty("webdriver.gecko.driver", "C:\\\\Automation\\workspace\\Web_Auto\\Lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		
		//IE
		System.setProperty("webdriver.ie.driver", "C:\\\\Automation\\workspace\\Web_Auto\\Lib\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Gaurav");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Singh");
		driver.findElement(By.name("login")).click();		
		driver.quit();
	}

}
