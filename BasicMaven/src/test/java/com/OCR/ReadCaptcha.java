package com.OCR;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadCaptcha {
	@Test
	public void ReadCaptchaData() throws InterruptedException, IOException, TesseractException{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letsnurture.com/blog/8-widely-used-captcha-examples.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File src = driver.findElement(By.xpath("//*[@id='wrapper']/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/p[4]/a/img")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./OCRImages/captcha.png"));
		ITesseract image = new Tesseract();
		String str = image.doOCR(new File("./OCRImages/captcha.png"));
		Reporter.log(str,true);
		driver.quit();
	}
}
