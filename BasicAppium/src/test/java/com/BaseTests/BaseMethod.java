package com.BaseTests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseMethod {
/*
 * Test case to install app. Make sure device is open
 */
	public static AndroidDriver<AndroidElement> invokeApp() throws MalformedURLException{
		
		//Provide- App:APK, DeviceName:Test1, Port:4723
		
		//APK file path
		File dir = new File("apk");
		File app = new File(dir, "ApiDemos-debug.apk");
		//Need desired caps to be passed to android driver
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Test1");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
		
	}

}
