package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import miscellaneous.BaseClass;

public class GroupInstall extends BaseClass{
	public GroupInstall(WebDriver driver){
		super(driver);
	}
	
	//convert dropdown which are in edit format
	public static void Changedropdown(WebElement ele){
		((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", ele);
	}
	
	public static Select empID_dropdown(){
		Changedropdown(driver.findElement(By.xpath("")));
		return new Select(driver.findElement(By.xpath("")));
	}
	
	public static WebElement internalGrp_textField(){
		return driver.findElement(By.xpath(""));
	}
}
