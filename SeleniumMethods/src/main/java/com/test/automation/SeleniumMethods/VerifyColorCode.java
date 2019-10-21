/**
 * 
 */
package com.test.automation.SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.text.automation.Libabries.ColorMethod;

/**
 * @author nagarjuna
 *
 */
public class VerifyColorCode {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\E drive\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://staging.infotracktelematics.com/meiko");

	}

	@Test
	public void VerifyColor() throws Exception {

		driver.findElement(By.cssSelector("input#username")).sendKeys("meiko");
		driver.findElement(By.cssSelector("input#password")).sendKeys("welcome");
		String hexcolor = ColorMethod.ColorVerify(driver, "button[type='submit']", "background-color");
		System.out.println(hexcolor);
		String expected = "#253a73";
		Assert.assertEquals(hexcolor, expected);
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}

}
