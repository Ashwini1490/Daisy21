package com.testingshastra.uitest.uitests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.config.BaseClass1;
import com.testingshastra.keywords.UIkeyword1;
import com.testingshastra.pages.HomePage;
import com.testingshastra.pages.JoinMeetingPage;

public class HomePageTest extends BaseClass1 {
	UIkeyword1 keyword=UIkeyword1.getInstance1();
	
	@Test
	public void verifyTitleOfHomePage() {
		String exceptedTitle="IJmeet";
	 Assert.assertEquals(keyword.driver.getTitle(),exceptedTitle);

	}
	@Test
         public void verifyIfUserRedirectToJoinMeetingPage() throws InterruptedException {
			HomePage home=new HomePage();
			home.rightClickOnNavBar();
			Thread.sleep(5000);
			
			home.clickOnJoinMeetingTab();
			JoinMeetingPage joinMeeting=new JoinMeetingPage();
			String actual=joinMeeting.getQuickJoinMeetingTitle();
			
			
			Assert.assertTrue(actual.contains("Quick"));

		}
	@Test
	public void printAllInfoLinks() {
		HomePage home=new HomePage();
		home.getTextOfInfoLinks();

	}
}
