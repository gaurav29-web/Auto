package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
		List<WebElement> radio = driver.findElements(By.xpath("//*[@type='radio']"));
		for(WebElement ele:radio){
			System.out.println(ele.getAttribute("value"));
			ele.click();
		}
	}

}
