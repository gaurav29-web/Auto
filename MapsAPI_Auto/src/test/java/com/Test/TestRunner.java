package com.Test;

import java.io.File;
import java.nio.file.StandardCopyOption;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Exceptions.ResourceLoaderException;
import com.Util.APIStatistics;
import com.Util.AuthorizationUtil;
import com.Util.BuildParameters;
import com.Util.ConfigurationBuilderUtil;
import com.vimalselvam.cucumber.listener.ExtentProperties;

import io.cucumber.messages.internal.com.google.common.io.Files;

@RunWith(Cucumber.class)
@ExtendedCucumberOptions(jsonReport="target/cucumber-reports/cucumber.json", jsonUsageReport = "targer/cucumber-reports/cucumber-usage.json" ,
outputFolder="target/cucumber-reports",retryCount=3, detailedReport=true, detailedAggregatedReport=true, overviewReport=true, 
usageReport=true, toPDF=true)
@CucumberOptions(
		features="src/test/java/features",
		tags = {"@Tag1", "Tag2"},
		format={"pretty","html:target/test-reports"},
		plugin = {"html:target/cucumber-reports/cucumber-html-report",
				"json:target/cucumber-reports/Cucumber.json",
				"pretty:target/cucumber-reports/cucumber-pretty.txt",
				"usage:target/cucumber-reports/cucumber-usage.json",
				"junit:target/cucumber-reports/cucumber-results.xml",
				"com.cucumber.listener.ExtentCucumberFormatter:"}, monochrome=true, strict=true,snippets=SnippetType.CAMELCASE)
public class TestRunner {
	private static Logger _log = LogManager.getLogger(TestRunner.class);
	
	@BeforeClass
	public static void setUp(){
		ExtentProperties extentprop = ExtentProperties.INSTANCE;
		extentprop.setReportPath("target/cucumber-extent-reports/"+BuildParameters.GetTestReportName());
		ConfigurationBuilderUtil.ProcessConfiguration();
		AuthorizationUtil.GenerateToken();
		
		String dirName = "target/cucumber-extent-reports/";
		
		File from = new File("src/test/resources/ReportIndexFile/index.html");
		File dir = new File(dirName);
		dir.mkdirs();
		File to = new File(dirName + "index.html");
		Files.copy(from.toPath(), to.toPath(), StandardCopyOption.REPLACE_EXISTING);
	}
	
	@AfterClass
	public static void VerifyAPIcallsAgainstScenario(){
		_log.info(String.format("Number of API Tests: %s, Number of API Hits %s", APIStatistics.API_TEST_SCENARIOS, APIStatistics.API_HIT_Count));
		
		if(APIStatistics.API_HIT_Count-APIStatistics.API_TEST_SCENARIOS>APIStatistics.API_MISMATCH_THRESHOLD){
			_log.warn(String.format("Difference between API hit count is %s, which is over the threshold value %s. This could be because there are API calls that are used for setting up tests contributing towards API hit count. Please set RestAssured extension.setApiCall(false) for setup API calls.",
					(APIStatistics.API_HIT_Count-APIStatistics.API_TEST_SCENARIOS), APIStatistics.API_MISMATCH_THRESHOLD));}
		if(!APIStatistics.DoesAPICallsMatchScenariosCount()){
			_log.error(String.format("%s API scenarios tagged with @APITest", APIStatistics.GetMismatchCount()));
		}
	}
}
