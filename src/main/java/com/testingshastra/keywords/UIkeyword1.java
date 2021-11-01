package com.testingshastra.keywords;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class contain UI keywords which are applicable for WebElement and
 * general action This is singelton class.To create object of this class,use
 * {@code getInstance()} method
 * 
 * @author Ashwini Chaudhari
 *
 */


public class UIkeyword1 {
	public  RemoteWebDriver driver ;
	private static UIkeyword1 uikeywords;
	static {
		uikeywords = new UIkeyword1();
	}

	public static UIkeyword1 getInstance1() {
		return uikeywords;
	}

	private UIkeyword1() {

	}

	/**
	 * This keyword is used to lanch the browser
	 * 
	 * @param browserName must be following:
	 *                    <ul>
	 *                    <li>Chrome</li>
	 *                    <li>Firefox</li>
	 *                    <li>IE</li>
	 *                    </ul>
	 */


	public void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			System.err.println("Invalid Browser Name :" + browserName);
		}

	}
	
	public void lanchUrl(String url) {
		driver.get(url);

	}
	public void click(WebElement element) {
		element.click();
	}
	public void enterText(WebElement element,String textToEnter) {
		element.sendKeys(textToEnter);
	}
	/*
	 * In the next version of framwork,this method will be deleted.Instead you can use enterText(String object,String textToEnter)
	 */
	
	@Deprecated
	public void enterText(String locatorType,String locatorValue,String textToEnter) {
	    
		getWebElement(locatorType,locatorValue).sendKeys(textToEnter);
	}
	
	public WebElement getWebElement(String locatorType,String locatorValue) {
         WebElement element=null;
         if(locatorType.equalsIgnoreCase("xpath")) {
 			element=driver.findElement(By.xpath(locatorValue));
 		}
 		if(locatorType.equalsIgnoreCase("css")) {
 			element=driver.findElement(By.cssSelector(locatorValue));
 		}
 		if(locatorType.equalsIgnoreCase("id")) {
 			element=driver.findElement(By.cssSelector(locatorValue));
 		}
 		if(locatorType.equalsIgnoreCase("name")) {
 			element=driver.findElement(By.cssSelector(locatorValue));
 		}
 		if(locatorType.equalsIgnoreCase("class")) {
 			element=driver.findElement(By.cssSelector(locatorValue));
 		}
 		if(locatorType.equalsIgnoreCase("tag")) {
 			element=driver.findElement(By.cssSelector(locatorValue));
 		}
 		return element;
 	}
	public void switchToFrameAt(int index) {
		driver.switchTo().frame(index);

	}
	public void swichToFrame(String idOrName) {
		driver.switchTo().frame(idOrName);

	}
	public void switchToFrame(WebElement frame) {
		driver.switchTo().frame(frame);

	}
	public void swichToDefaultContent() {
		driver.switchTo().defaultContent();

	}
	
	public String getTitleOfPage() {
		return driver.getTitle();
		
	}
	public String getCurrentUrl() {
	 return driver.getTitle();

	}
    
	public RemoteWebDriver getDriver() {
		return driver;
	}

     public void click(String locatorType, String locatorValue) {
		getWebElement(locatorType,locatorValue).click();
		}

	public void quiteBrowser() {
		// TODO Auto-generated method stub
		
		
		
	}

	public void enterText(String object, String textToEnter) {
		String[] part=object.split("##");
		getWebElement(part[0],part[1]).sendKeys(textToEnter);
		
	}
}


