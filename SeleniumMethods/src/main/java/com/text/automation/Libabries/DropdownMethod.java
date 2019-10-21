/**
 * 
 */
package com.text.automation.Libabries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * @author nagarjuna
 *
 */
public class DropdownMethod {
	
	public static void verifyDropdown(WebDriver driver, String id, String text ) {
		/*
		 * Select is a class which is provided by Selenium to perform multiple
		 * operations on DropDown object and Multiple Select object. This class can be
		 * found under the Selenium’s Support.UI.Select package
		 */
		WebElement dd = driver.findElement(By.id(id));  
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText(text);
		//dropdown.selectByIndex(index);
		//dropdown.selectByValue(value);
		
	}

}
