/**
 * 
 */
package com.text.automation.Libabries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author nagarjuna
 *
 */
public class ExplicitWaitMethod {

	public void explictWait(WebDriver driver, int timeOutInSeconds, WebElement element) {
      WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
      wait.until(ExpectedConditions.visibilityOf(element));
	}

}
