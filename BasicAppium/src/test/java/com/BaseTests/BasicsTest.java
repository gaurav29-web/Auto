package com.BaseTests;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasicsTest extends BaseMethod{

	@Test
	public void Test1() throws MalformedURLException{
		AndroidDriver<AndroidElement> driver = invokeApp(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Name");
		List<AndroidElement> ls= driver.findElementsByClassName("android.widget.EditText");
		ls.get(1).click();
	}
}
