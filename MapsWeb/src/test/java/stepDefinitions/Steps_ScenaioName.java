package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_ScenaioName {
	static WebDriver driver;
	
	public Steps_ScenaioName(){
		this.driver = Hooks.driver;
	}
	
	@Given("Step1")
	public void step1(){
		driver.getTitle();
	}
	
	@When("Step2")
	public void step2(){		
	}
	
	@Then("Step3")
	public void step3(){
	}
}
