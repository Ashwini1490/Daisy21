package com.testingshastra.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.keywords.UIkeyword1;

public class HomePage {
	UIkeyword1 keyword=UIkeyword1.getInstance1();
	/**
	 * By useing page factory element
	 */
	
	@FindBy(css="div#navbarContent li:nth-child(1)")
	public WebElement joinMeetingTab;
	
	
    public WebElement navbarContent;
	
	@FindBy(css="div.footer-last-view-support div:nth-child(3) li a")
	public List<WebElement> infoLinks;
	
	public HomePage() {
		PageFactory.initElements(keyword.driver,this);
	}

	public void clickOnJoinMeetingTab() {
		joinMeetingTab.click();
	

	}
	public void  getTextOfInfoLinks() {
		Iterator<WebElement> itr=infoLinks.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getText());
		}

	}
	public void rightClickOnNavBar() {
		Actions act=new Actions(keyword.driver); 
        act.contextClick(navbarContent).build().perform();
	}
	
}
