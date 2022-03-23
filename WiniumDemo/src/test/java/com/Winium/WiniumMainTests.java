package com.Winium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class WiniumMainTests {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		Thread.sleep(5000);
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		driver.findElement(By.name("Close")).click();
	}

}
