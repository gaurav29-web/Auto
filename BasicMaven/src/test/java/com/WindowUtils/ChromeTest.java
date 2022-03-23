package com.WindowUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.sun.jna.platform.WindowUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {

	@Test
	public void ChromeDriverTest(){
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		System.out.println(driver.getTitle());*/
	//	WindowUtils.killprocessByName("chromedriver.exe");
		System.out.println("ChromeDriverTest");
	}
	
	@Test(priority=0)
	public void Qest1(){
		System.out.println("priority=0");
	}
	
	@Test(priority=1)
	public void Best2(){
		System.out.println("priority=1");
	}
	
	@Test
	public void Dest3(){
		System.out.println("Dest3");
	}
	
	@Test
	public void Aa(){
		System.out.println("Aa");
	}
}
