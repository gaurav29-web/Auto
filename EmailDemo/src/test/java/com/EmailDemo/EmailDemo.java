package com.EmailDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class EmailDemo {

	public static void main(String[] args) throws  InterruptedException{		
		//Add maven dependency. Does not take screen shot. Is fastes headless browser
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://commons.apache.org/proper/commons-email/userguide.html");
		Thread.sleep(2000);
		driver.quit();
	}

}
