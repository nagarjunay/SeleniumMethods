package com.text.automation.Libabries;

/**
 * @author nagarjuna
 *
 */


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CountnumofLinksinWebPageMethod {

	/* To find number of hyper link in web page and Count */
	public static void count_numof_links_Method1(WebDriver driver, String tagname) {

		List<WebElement> count = driver.findElements(By.tagName(tagname));
		int linkListCount = count.size();
		for (WebElement element : count) {
			String urls = element.getAttribute("href");
			System.out.println(urls);
		}
	}

	/* To find number of hyper link size and display text */
	public static void count_numof_links_Method2(WebDriver driver, String tagname) {

		List<WebElement> count = driver.findElements(By.tagName(tagname));
		int listcount = count.size();
		for (int i = 0; i < listcount; i++) {
			System.out.println(count.get(i).getText());
		}
	}

}
