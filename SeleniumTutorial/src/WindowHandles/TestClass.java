package WindowHandles;

import java.beans.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TestClass {

	public static void main(String[] args) throws IOException, SQLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		System.out.println(ele.size());
		/*WebElement ele1 = driver.findElement(By.xpath(""));
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.switchTo().frame(1);
		driver.switchTo().defaultContent();
		int iframes = driver.findElements(By.tagName("iframe")).size();
		
		//Get parent window
		String ParentID = driver.getWindowHandle();
		
		//All window handles
		Set<String> allWin =driver.getWindowHandles();
		int AllWin = driver.getWindowHandles().size();
		for(String childID:allWin){
			driver.switchTo().window(childID);
		}
		
		//Broken Links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int allLinks = links.size();
		//Iterator<WebElement> itr = links.iterator();
		for(WebElement ele: links){
			String url = ele.getAttribute("href");
			
			URL actUrl = new URL(url);
			HttpsURLConnection huc = (HttpsURLConnection)actUrl.openConnection();
			huc.setConnectTimeout(2000);
			huc.connect();
			huc.getResponseCode();
		}*/
		
		//Chrome options
		/*System.setProperty("webdriver.chrome.driver", "path");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		options.addArguments("");
		Webdriver driver = new ChromeDriver(options);*/
		
		//Read Config
		/*Properties pro = null;
		File file = new File("Path");
		FileInputStream fis = new FileInputStream(file);
		pro.load(fis);
		String chromepath = pro.getProperty("Chrome");
		
		//Database
		Connection con = DriverManager.getConnection("rul");*/
		//Statement smt = con.createStatement();
		//ResultSet rs = smt.executequery("query");
		//while(rs.next()){
			//rs.getString("colmnname");}
		
		}
	}
