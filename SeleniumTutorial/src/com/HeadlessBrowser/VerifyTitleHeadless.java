package com.HeadlessBrowser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class VerifyTitleHeadless {
	@Test
	public void PhantomJS() throws InterruptedException{
		File src = new File("C:\\Automation\\phantomjs-2.1.1-windows\\bin");
		System.setProperty("phatomjs.binary.path", src.getAbsolutePath());
		DesiredCapabilities cap = new DesiredCapabilities();
		WebDriver driver = new PhantomJSDriver(cap);
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}
