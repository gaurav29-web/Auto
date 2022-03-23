package com.ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {

	@Test
	public void ChromeDriverTest(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		System.out.println(driver.getTitle());
		WebElement mainEle = driver.findElement(By.xpath("//*[@id='main']/div[3]/div[1]/div"));
		Actions act = new Actions(driver);
		act.moveToElement(mainEle).perform();
		WebElement tooltipEle = driver.findElement(By.xpath("//*[@id='main']/div[3]/div[1]/div/span"));
		System.out.println(tooltipEle.getText());
		driver.quit();	
		
	}
}
