package com.Util;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfigurationBuilderUtil {
	private static Logger _log = LogManager.getLogger(ConfigurationBuilderUtil.class);
	
	public static void ProcessConfiguration(){
		URL configFile = BuildParameters.class.getClass().getResource("/configurations.properties");
		try{
			InputStream configFileStream = configFile.openStream();
			Properties p = new Properties();
			p.load(configFileStream);
			configFileStream.close();
			
			TestIdentityConfig(p);
			EnvironmentCredentialsConfig(p);
		}
		catch(Exception e){
			_log.error(e.getMessage());
		}
	}
	
	private static void TestIdentityConfig(Properties p){
		String identity = p.get("test.identity").toString();
		if(null!=identity && !identity.isEmpty()){
			BuildParameters.TEST_IDENTITY=identity;
		}
	}
	
	private static void EnvironmentCredentialsConfig(Properties p){
		String env = BuildParameters.GetEnvironment();
		if(null==env || env.isEmpty()){
			env = "dev3";
			_log.warn("defaulting to dev3");
		}
		
		String prop = p.get(env+".username").toString();
		if(null!=prop && !prop.isEmpty()){
			AuthorizationUtil.API_USERNAME=prop;
		}
		
		prop = p.get(env+".password").toString();
		if(null!=prop && !prop.isEmpty()){
			AuthorizationUtil.API_PASSWORD=prop;
		}
		
		prop = p.get(env+".authrequired").toString();
		if(null!=prop && !prop.isEmpty()){
			AuthorizationUtil.AUTH_REQUIRED=Boolean.parseBoolean(prop);
		}
	}
}
