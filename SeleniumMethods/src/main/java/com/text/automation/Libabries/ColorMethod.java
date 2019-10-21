package com.text.automation.Libabries;

/**
 * @author nagarjuna
 *
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class ColorMethod {
	
	public static String ColorVerify(WebDriver driver, String cssSelector, String cssValue)
	{
		/* This method used to verify color code*/
		WebElement target = driver.findElement(By.cssSelector(cssSelector));
		String colorCode= target.getCssValue(cssValue);
		String hexacolor = Color.fromString(colorCode).asHex();
		return hexacolor;
	}

}
