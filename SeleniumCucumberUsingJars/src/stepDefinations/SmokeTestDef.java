/*package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTestDef {
	
	WebDriver driver;
	@Given("^Launch chrome browser$")
	public void Launch_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	}

	@When("^Browser is opened$")
	public void Browser_is_opened() throws Throwable {
	    driver.get("https://www.facebook.com/");
	}

	@Then("^Home page is visible$")
	public void Home_page_is_visible() throws Throwable {
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.quit();
	}
}
*/