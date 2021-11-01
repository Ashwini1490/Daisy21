package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.keywords.UIkeyword1;

public class JoinMeetingPage {
	UIkeyword1 keyword=UIkeyword1.getInstance1();
	@FindBy(css = "div.joinmeeting")
	public WebElement quickJoinMeetingTitle;

	public JoinMeetingPage() {
	
		PageFactory.initElements(keyword.driver, this);
	}

	public String getQuickJoinMeetingTitle() {
		return quickJoinMeetingTitle.getText();
	}

}
