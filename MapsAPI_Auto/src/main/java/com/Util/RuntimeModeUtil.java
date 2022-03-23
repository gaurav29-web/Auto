package com.Util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RuntimeModeUtil {
	private static Logger _log = LogManager.getLogger(RuntimeModeUtil.class);
	
	public static boolean IsDebug(){
		return java.lang.management.ManagementFactory.getRuntimeMXBean().getInputArguments().toString().indexOf("-agentlib:jdwp")>0;
	}
	
	public static String GetDomainUser(){
		try{
			return String.format("%s@%s", System.getenv("USERNAME"),System.getenv("USERDNSDOMAIN"));
		}
		catch(Exception e){
			_log.warn("No domain user found");
			return null;
		}
	}
}
