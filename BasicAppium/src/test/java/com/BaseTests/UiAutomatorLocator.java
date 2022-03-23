package com.BaseTests;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiAutomatorLocator extends BaseMethod{

	@Test
	public void Test1() throws MalformedURLException{
		AndroidDriver<AndroidElement> driver = invokeApp(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator(""); 
	}
}
