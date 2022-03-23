package com.Dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap4/bootstrap_dropdowns.asp");
		driver.manage().window().maximize();
		WebElement ele1 = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		ele1.click();
		Thread.sleep(2000);
		
		List<WebElement> eleList = new ArrayList<WebElement>();
		eleList = driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
		for(WebElement ele:eleList){
			//Use getAttribute(innerHTML) to get text of element. Either a button text, link text etc
			System.out.println(ele.getAttribute("innerHTML"));
		}
		driver.quit();
	}

}
