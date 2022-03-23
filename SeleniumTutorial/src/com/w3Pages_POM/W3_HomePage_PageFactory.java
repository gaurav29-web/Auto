package com.w3Pages_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class W3_HomePage_PageFactory {
	
	//Use cache look up will increase performance since it will not check element again on again on web page. But only use when you are sure xpath will not change
	@FindBy(xpath="//*[@id='w3loginbtn']")
	@CacheLookup
	WebElement login;
	
	//Standard approach. Use how for dynamic approach
	@FindBy(how=How.XPATH,using="//*[@id='main']/div[1]/div[1]/a[1]")
	WebElement html;
	
	WebDriver driver;
	
	public W3_HomePage_PageFactory(WebDriver driver){
		this.driver=driver;
	}
	public void clickLogin(){
		login.click();
	}
}
