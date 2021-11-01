package com.testingshastra.uitest.homepagetests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.config.BaseClass1;
import com.testingshastra.keywords.UIkeyword1;


public class HomePageTest1 extends BaseClass1 {
	UIkeyword1 keyword=UIkeyword1.getInstance1();
	String expectedTitle="Testing Shastra | Training | Placement";
	
	@Test
	
	public void verifyTitleOfHomePage()  {
		keyword.lanchUrl("https://www.testingshastra.com");
		String title=keyword.getTitleOfPage();
		Assert.assertEquals(title, expectedTitle);
	}

	

}