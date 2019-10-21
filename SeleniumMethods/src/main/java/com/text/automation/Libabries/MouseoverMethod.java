/**
 * 
 */
package com.text.automation.Libabries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author nagarjuna
 *
 */
public class MouseoverMethod {

	public void mouseover(WebDriver driver, String xpathExpression) {
		/*
		 * The user-facing API for emulating complex user gestures. Use this class
		 * rather than using the Keyboard or Mouse directly. Implements the builder
		 * pattern: Builds a CompositeAction containing all actions specified by the
		 * method calls.
		 */

		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.xpath(xpathExpression));
		act.moveToElement(target).build().perform();
	}

}
