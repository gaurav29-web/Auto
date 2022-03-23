package com.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class ReadConfig {

	public Properties ReadCon() throws IOException{
		File src = new File("./Configuration/config.property");
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		return pro;
	}
}
