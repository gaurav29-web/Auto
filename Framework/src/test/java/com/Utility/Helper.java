package com.Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	public static String captureSCreenShot(WebDriver driver){
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath = "./Screenshots/Login"+getCurrentDateTime()+".png";
		try {
			FileHandler.copy(src, new File(screenshotPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return screenshotPath;
	}
	
	public static String getCurrentDateTime(){
		//Note -- Caps MM and HH are only in CAPS
		DateFormat format = new SimpleDateFormat("MM_dd_yyy_HH_mm_ss");
		Date currDate = new Date();
		return format.format(currDate);		
	}
}
