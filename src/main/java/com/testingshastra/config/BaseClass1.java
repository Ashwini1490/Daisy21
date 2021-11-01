package com.testingshastra.config;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.testingshastra.keywords.UIkeyword1;

public class BaseClass1 {
	UIkeyword1 keyword=UIkeyword1.getInstance1();
	public RemoteWebDriver driver=null;
	
	@BeforeMethod
	public void setUp() {
		Application app=new Application();
		keyword.openBrowser(app.getBrowser());
		this.driver=keyword.getDriver();
		driver.get(app.geyAppUrl());
		
	}
	@AfterMethod
	
	public void tearDown() {
		keyword.quiteBrowser();

	}

}