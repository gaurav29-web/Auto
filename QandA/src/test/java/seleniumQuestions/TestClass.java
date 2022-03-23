package seleniumQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		//Firefox
		/*System.setProperty("webdriver.gecko.driver", "G:\\\\workspace\\Web_Auto\\Lib\\geckodriver.exe");
		WebDriver ff_driver = new FirefoxDriver();
		ff_driver.get("https://google.com");
		System.out.println("Successfully launched browser through Firefox");
		Thread.sleep(5000);		
		ff_driver.quit();*/
		
		//IE
		/*System.setProperty("webdriver.ie.driver", "G:\\\\workspace\\Web_Auto\\Lib\\IEDriverServer.exe");
		InternetExplorerDriver ie_driver = new InternetExplorerDriver();
		ie_driver.get("https://google.com");
		System.out.println("Successfully launched browser through IE");
		Thread.sleep(5000);		
		ie_driver.quit();*/
		
		//Chrome
		System.setProperty("webdriver.chrome.driver", "G:\\\\workspace\\Web_Auto\\Lib\\chromedriver.exe");
		
		//Set headless Chrome options
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1200x600");
		
		WebDriver driver = new ChromeDriver(options);*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("Successfully launched browser through through chrome");
		driver.manage().window().maximize();
		driver.quit();
	}
}
