package com.BaseClassDemo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MainClass extends BaseClass{

	@Test(description="Test to verify base class")
	public void TestMutipleWindows(){
		
		//more than one event first build and then call perform
		Actions act = new Actions(driver);
		act.click().build().perform();
		
		WebElement ele1 = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		Assert.assertTrue(ele1.isDisplayed());
		Reporter.log("============Element exist==============",true);
	}
}
