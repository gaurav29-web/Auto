package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigFileReader {
public Properties pro;
	public ConfigFileReader(){
		File src = new File("./Config/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String browserPath(){
		return pro.getProperty("browser");		
	}
	
	public String URLPath(){
		return pro.getProperty("url");		
	}
}
