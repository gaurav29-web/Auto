package com.Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		WebElement ele1 = driver.findElement(By.xpath("month"));
		Select month = new Select(ele1);
		month.selectByValue("2");
		month.selectByIndex(0);
		month.selectByVisibleText("Oct");
		
		//get first selected element
		WebElement firstOp =  month.getFirstSelectedOption();
		System.out.println(firstOp.getText());
		
		//List for getting all values
		List actList = new ArrayList();
		//Get all options available		
		List<WebElement> listofOption= month.getOptions();
		for(WebElement ele2:listofOption){
			System.out.println(ele2.getText());
			actList.add(ele2.getText());
		}
		
		
		//Get all selected options available		
		List<WebElement> listofSelOption= month.getAllSelectedOptions();
		for(WebElement ele3:listofOption){
			System.out.println(ele3.getText());
		}
		
		//Sorting select elements value
		
		List temp = new ArrayList();
		temp.addAll(actList);
		
		//Collections for ordering it
		Collections.sort(temp);
		
		//Two lists should be same temp and actual list
		
	}

}
