package com.testingshastra.config;

import com.testingshastra.util.PropertiesFile1;

public class Application {
	private static final String FILEPATH="/src/main/resources/application.properties";
	
	public String getBrowser() {
	      return PropertiesFile1.getProperty(FILEPATH,"Chrome");

	}
	public String geyAppUrl() {
		return PropertiesFile1.getProperty(FILEPATH,"daisy.dev.app.url");

	}
	public void GetDbUrl() {
		

	}
	public void getUserName() {
		
	}
	public void geyPassword() {
	
	}

}
