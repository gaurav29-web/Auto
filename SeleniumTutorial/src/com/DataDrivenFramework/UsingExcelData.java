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

import com.lib.ExcelDataConfig;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class UsingExcelData {
	
	//Sets connection with data provider added below. String dropdn param accepts number of values in data provider method
	@Test(dataProvider="dropdownData")
	public void DataProvider(String dropdn, String val2){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();			
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement ele1 = driver.findElement(By.xpath("month"));
		wait.until(ExpectedConditions.visibilityOf(ele1));		
		Select month = new Select(ele1);
		month.selectByValue(dropdn);
		System.out.println(month.getFirstSelectedOption().getAttribute("value"));
		System.out.print(val2);
		driver.quit();
	}
	
	//added Data provider name that can be used in above tests. Object is created which can accept string or other data type
	@DataProvider(name="dropdownData")
	public Object[][] GetData(){
		ExcelDataConfig config = new ExcelDataConfig();
		int rows = config.getRowCount(0);		
		Object[][] data = new Object[rows][2];
		for(int i=0;i<rows;i++){
			data[i][0] = config.getData(0, i, 0);
			data[i][1] = config.getData(0, i, 1);
		}
		return data;
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
}