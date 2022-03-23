package miscellaneous;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.Constants;

public class BeforeAndAfter {
	@BeforeSuite
	public void beforeSuite() throws InvalidFormatException, IOException{
		Constants.startInfobank();
	}
	
	@AfterSuite
	public void afterSuite(){}
}
