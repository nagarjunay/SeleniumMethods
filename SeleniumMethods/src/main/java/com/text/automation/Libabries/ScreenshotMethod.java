/**
 * 
 */
package com.text.automation.Libabries;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author nagarjuna
 *
 */
public class ScreenshotMethod {
	
	public static void capture_screenshot(WebDriver driver) throws Exception {
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./screenshots/img.png"));
				
	}

}
