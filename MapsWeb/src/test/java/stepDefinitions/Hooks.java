package stepDefinitions;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.yaml.snakeyaml.scanner.Constant;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import miscellaneous.BaseClass;
import utilities.Constants;
import utilities.Utils;

public class Hooks {
	public static WebDriver driver;
	protected static String fileSeperator = System.getProperty("file.seperator");
	
	@AfterMethod
	void teardown(){
		driver.quit();
	}
	
	public String getTimeStamp(){
		String today;
		DateFormat dateformat = new SimpleDateFormat("yyyy.MM.dd.HH.ms.ss");
		Calendar cal = Calendar.getInstance();
		today = dateformat.format(cal.getTime());
		return today;
	}
	
	public void tearDown(Scenario sc){
		try{
			  if(sc.isFailed()){
				  String fileSeperator = null;
				  String screenshotName = sc.getName()+""+getTimeStamp()+".png";
				  String TotalFileName = sc.getId().split(";")[0];
				  String FeatureName = TotalFileName.replace("-", "_").toUpperCase();
				  String imagePath = ".."+fileSeperator+"Screenshots"+fileSeperator+"Results"+fileSeperator+
						  FeatureName+fileSeperator+takeScreenShot(screenshotName,FeatureName);
				  
				  byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				  sc.embed(screenshot, "image/png");
			  }
		}
		catch(Exception e){ e.printStackTrace();}
	}
	
	public String takeScreenShot(String screenShotName,String featureName){
		try{
			File file = new File("Screenshots"+fileSeperator+"Results");
			if(!file.exists()){
				file.mkdir();
			}
			
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File targetFile = new File("Screenshots"+fileSeperator+"Results"+fileSeperator+featureName,screenShotName);
			FileUtils.copyFile(screenshotFile, targetFile);
			return screenShotName;
		}
		catch(Exception e){
			return null;
		}
	}
	
	@Before
	public void openBrowser(Scenario sc){
		driver = Utils.getChrome(driver);
		new BaseClass(driver);
		driver.manage().window().maximize();
		driver.get(Constants.MAPS_UI_URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}






















