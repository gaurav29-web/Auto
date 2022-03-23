package com.ConfigurationFileDemo;

import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.lib.ReadConfig;

public class ReadConfigFile {

	@Test
	public void readDataFromConfigFile() throws IOException{
		ReadConfig con = new ReadConfig();
		
		//Use Properties file to store Object properties as well and create Object repostitory.
		Properties pr = con.ReadCon();
		String chromePath = pr.getProperty("ChromeDriver");
		System.out.print(chromePath);
		//Generates HTML report and also true flag wil show on console. False will not display message on console
		Reporter.log(chromePath,true);
	}
}
