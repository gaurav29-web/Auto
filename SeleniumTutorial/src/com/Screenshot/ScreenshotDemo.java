package com.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotDemo {

	@Test
	public void TestScreenshot() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap4/bootstrap_dropdowns.asp");
		driver.manage().window().maximize();
		
		//Screenshot using Ashot
		Screenshot sshot = new AShot().takeScreenshot(driver);
		ImageIO.write(sshot.getImage(), "jpg", new File(".\\Screenshots\\fullimage.jpg"));
		
		//take screen shot of specific element
		WebElement ele1 = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		Screenshot screenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,ele1);

		ImageIO.write(screenshot1.getImage(), "jpg", new File(".\\Screenshots\\fullimage.jpg"));
		
		driver.quit();
	}
}
