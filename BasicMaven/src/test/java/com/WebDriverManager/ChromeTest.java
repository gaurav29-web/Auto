package com.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {

	@Test
	public void ChromeDriverTest(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
		WebDriverManager.chromedriver().version("86").setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.w3schools.com/");
		System.out.println(driver1.getTitle());
		driver1.quit();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver ffdriver = new FirefoxDriver();
		ffdriver.get("https://www.w3schools.com/");
		System.out.println(ffdriver.getTitle());
		ffdriver.quit();
	}
}
