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
public class DragandDropMethod {

	public static void draganddrop(WebDriver driver, String src_xpathExpression, String Des_xpathExpression ) {

		WebElement src = driver.findElement(By.xpath(src_xpathExpression));
		WebElement des = driver.findElement(By.xpath(Des_xpathExpression));
		Actions action = new Actions(driver);
		action.clickAndHold(src).moveToElement(des).release().build();
		
	}

}
