package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage {
	WebDriver driver;
	
	public void LoginPage(WebDriver ldriver){
		this.driver = ldriver;
	}
	
	@FindBy(xpath="//*[@id='w3loginbtn']") WebElement LoginBtn;
	
	public void loginApp(String input){
		LoginBtn.click();
		Reporter.log("Input val== "+input,true);
	}
}
