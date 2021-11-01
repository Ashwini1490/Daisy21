package com.testingshastra.util;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testingshastra.keywords.UIkeyword1;
/**
 * This class is created for custome wait
 * @author Ashwini Chaudhari
 *
 */

public class WaitFor {
	private static final WebDriverWait wait ;
	static {
		wait=new WebDriverWait(UIkeyword1.getInstance1().driver,Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(500));
	}
		public static void visiblityOfElement(WebElement element,long duration) {
		wait.withTimeout(Duration.ofSeconds(duration));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
		public static void stalenessOfElement(WebElement element,long duration) {
			wait.withTimeout(Duration.ofSeconds(duration));
			wait.ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.stalenessOf(element));
			
		}
		
		/**
		 * This method waits for the element to be clickable
		 * max timeout is 30 which is not confuguration
		 * @param element
		 */
		public static void elementToBeClickable(WebElement element) {
			wait.withTimeout(Duration.ofSeconds(30));
			wait.ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}

}
