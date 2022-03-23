package seleniumQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://xndev.com/palindrome");
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//*[text()='Is This a Palindrome?']")).getText());
	}

}
