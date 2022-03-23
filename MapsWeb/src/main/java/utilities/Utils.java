package utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.imageio.ImageIO;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.base.Strings;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Utils {
	public static Connection getConnection(String url, String user, String password) throws SQLException{
		Connection con = DriverManager.getConnection(url,user,password);
		return con;
	}
	
	public static void connectToSQLserverDB() throws SQLException{
		String env = BuildParameters.GetBaseENV();
		String dbserver=null;
		String database=null;
		String user=null;
		String password=null;
		for(int i=1;i<=Constants.Environemnts.getLastRowNum();i++){
			if(env=="Expected value from infobank"){
					dbserver="";
					database="";
					user="";
					password="";
			}
		}
		String url="jdbc:sqlserver://"+dbserver+".ms.ds.uhc.com:1433;databaseName="+database+"";
		Constants.databaseConnection = DriverManager.getConnection(url,user,password);
		Constants.statement= Constants.databaseConnection.createStatement();
	}
	
	public static WebDriver getIE(){
		DesiredCapabilities cap = null;
		cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(CapabilityType.BROWSER_NAME, "Internet Explorer");
		cap.setCapability(CapabilityType.VERSION, "11");
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		cap.setCapability("ignoreZoomSetting", true);
		cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
		System.setProperty("webdriver.ie.driver", "./Lib/IEDriverServer.exe");
		System.setProperty("java.awt.headless", "false");
		WebDriver driver = new InternetExplorerDriver(cap);
		driver.manage().deleteAllCookies();
		return driver;
	}
	
	public static WebDriver getChrome(WebDriver driver){
		System.setProperty("webdriver.chrome.driver", "./Lib/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//if(config.runInHeadless()){
			options.addArguments("--window-size=1600*900");
			options.addArguments("--headless");
			options.addArguments("--disable-gpu");
			options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(options);
			return driver;
		}
	
	public static void js_click(WebDriver driver, WebElement ele){
		((JavascriptExecutor) driver).executeScript("arguments[0].click;", ele);
	}
	
	public static void takeScreenshot_Ashot(WebDriver driver, String outputFilePath, String filename) throws IOException{
		Screenshot screensht = new AShot().takeScreenshot(driver);
		ImageIO.write(screensht.getImage(), "PNG", new File(outputFilePath+filename+".png"));
	}
	
	public static void deleteCookies(WebDriver driver){
		driver.manage().deleteAllCookies();
	}
	
	public static String convertDateFormat(String inputDate){
		SimpleDateFormat date1 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");
		SimpleDateFormat date2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String formatedDate = null;
		try{
			formatedDate = date2.format(date1.parse(inputDate)).replace("/", "-");
		}catch(Exception e){}
		return formatedDate;
	}
	
	public static XSSFSheet excelSheet(String FilePath, String SheetName){
		XSSFSheet sheet=null;
		try{
			XSSFWorkbook wb = new XSSFWorkbook(new File(FilePath));
			sheet = wb.getSheet(SheetName);
		}
		catch(Exception e){}
		return sheet;
	}
	
	public static void waitForPageToLoad(WebDriver driver){
		try{
			for(int i=0;i<=i;i++){
				if(((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete")){
					break;
				}
			}
		}catch(JavascriptException e){}
	}
	
	public static void insertScreenshotForthisStep(WebDriver driver, String stepName){
		try{
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			Utils.waitForPageToLoad(driver);
			Utils.takeScreenshot_Ashot(driver, "./FailedScreenshots/", timeStamp+"_"+stepName);
			String screenPath = "./FailedScreenshots/"+timeStamp+"_"+stepName+".png";
			//Reporter.addScreenCaptureFromPath(screenPath);
		}
		catch(Exception e){}
	}
	
	public static void selectByVisibleText(WebElement element, String visibleText){
		new Select(element).selectByVisibleText(visibleText);
	}
	
	public static void selectByIndex(WebElement element, int index){
		new Select(element).selectByIndex(index);
	}
	
	public static void selectByValue(WebElement element, String value){
		new Select(element).selectByValue(value);
	}
	
	public static void Alert_Accept(WebDriver driver){
		try{
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		catch(Exception e){
			Assert.fail("failed to check Alert is displayed");
		}
	}
	
	public static String GetParamVal(String val){
		if(Strings.isNullOrEmpty(val)){
			return null;
		}
		else if(val.equalsIgnoreCase("no")) return "0";
		else if(val.equalsIgnoreCase("yes")) return "1";
		else if(!Strings.isNullOrEmpty(val)) return val;
		return null;
	}
	
	public static void scrollDownUntilElementIsFound(WebDriver driver, WebElement ele){
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
	}
}





























