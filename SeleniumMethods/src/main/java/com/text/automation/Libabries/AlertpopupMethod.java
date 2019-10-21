/**
 * 
 */
package com.text.automation.Libabries;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

/**
 * @author nagarjuna
 *
 */
public class AlertpopupMethod {
	
	public static void alertpopup(WebDriver driver) {
		Alert alert= driver.switchTo().alert();
		// Capturing alert message
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println("Captured alert message is: " + alertMessage);
		alert.accept();
	}
	

}
