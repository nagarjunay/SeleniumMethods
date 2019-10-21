/**
 * 
 */
package com.test.automation.SeleniumMethods;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.text.automation.Libabries.DragandDropMethod;

/**
 * @author nagarjuna
 *
 */
public class VerifyDragDrop {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\E drive\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");

	}

	@Test
	public void Verify_dragdrop() throws Exception {

	DragandDropMethod.draganddrop(driver, "//div[@id='div1']/img", "//div[@id='div2']");

	}

	/*@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}*/


}
