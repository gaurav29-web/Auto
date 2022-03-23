package com.Util;

public class BuildParameters {
	public static String BASE_URI="https://maps-api-tst1.uhc.com/api/maps";
	public static String TEST_IDENTITY = "API_AUTO_TEST";
	public static String ENVIRONMENT_NAME = "local";
	public static String TAG_NAME;
	public static String MILESTONE="";
	public static String _reportName = "last_report.html";
	public static String _serviceName = "servicename";
	public static String _baseURI = "baseuri";
	public static String _testTags = "cucumber.options";
	public static String _environment = "environment";
	public static String _debugMode = "debugmode";
	public static String _milestone = "milestone";
	
	public static String GetMilestone(){
		String rtnMilestone = System.getProperty(_milestone);
		if(null!=rtnMilestone && !rtnMilestone.isEmpty() && !rtnMilestone.toLowerCase().equals("none")){
			MILESTONE = rtnMilestone;
		}
		return MILESTONE;
	}
	
	public static String GetBaseURI(){
		String env = System.getProperty(_baseURI);
		if(null!=env && !env.isEmpty()){
			BASE_URI = String.format("http://%s", env);
		}
		return BASE_URI;
	}
	
	public static boolean IsDebugMode(){
		String debug = System.getProperty(_debugMode);
		if(null!=debug && !debug.isEmpty()){
			return Boolean.parseBoolean(debug);
		}
		return false;
	}
	
	public static String GetTestReportName(){
		String service = System.getProperty(_serviceName);
		if(null!=service && !service.isEmpty()){
			_reportName = String.format("%s.html", service);
		}
		return _reportName;
	}
	
	public static String GetEnvironment(){
		String environment = System.getProperty(_environment);
		if(null!=environment && !environment.isEmpty()){
			ENVIRONMENT_NAME = environment.toLowerCase();
		}
		return ENVIRONMENT_NAME;
	}
}
