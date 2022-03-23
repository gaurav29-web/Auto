package runner;

import java.io.File;

//import com.cucumber.listener.Reporter;
import org.testng.annotations.AfterClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="./Fetaures/", glue={"stepDefinitions"},
				dryRun=false, plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html","pretty",
						"html:cucumber_reports/HTML/POC.html","json:target/cucumber.json", "html:target/cucumber-reports/cucumber-pretty",
						"json:target/cucumber.json"},
				monochrome=true, tags={"@Smoke"})
public class TestRunner extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void teaddown(){
		/*Reporter.loadXMLConfig(new File("./src/test/resources/extent-config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Platform","Windows 10");
		Reporter.setSystemInfo("Environment","QA");*/
	}

}
