package com.w3Pages_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class W3_HomePage {
	
	WebDriver driver;
	By login = By.xpath("//*[@id='w3loginbtn']");
	By html = By.xpath("//*[@id='main']/div[1]/div[1]/a[1]");
	
	public W3_HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void login(){
		driver.findElement(login).click();
	}
	
	public void Learnhtml(){
		driver.findElement(html).click();
	}
}
