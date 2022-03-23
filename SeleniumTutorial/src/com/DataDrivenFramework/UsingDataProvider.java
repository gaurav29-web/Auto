package com.DataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class UsingDataProvider {
	
	//Sets connection with data provider added below. String dropdn param accepts number of values in data provider method
	@Test(dataProvider="dropdownData")
	public void DataProvider(String dropdn){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();			
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		/*WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='month']"));
		wait.until(ExpectedConditions.visibilityOf(ele1));		*/
		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByValue(dropdn);
		System.out.println(month.getFirstSelectedOption().getAttribute("value"));
		driver.quit();
	}
	
	//added Data provider name that can be used in above tests. Object is created which can accept string or other data type
	@DataProvider(name="dropdownData")
	public Object[] GetData(){
		Object[] data = new Object[3];
		data[0]="1";
		data[1]="2";
		data[2]="3";
		return data;
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
}