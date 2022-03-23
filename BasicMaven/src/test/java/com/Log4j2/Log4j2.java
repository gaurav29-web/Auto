package com.Log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2 {
	private static final Logger LOG = LogManager.getLogger();
	public static void main(String[] args) {
		LOG.debug("Debug mode");
		LOG.info("Info mode");
		System.out.println("Log 4j");
	}
}
