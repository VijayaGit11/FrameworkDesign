package com.qa.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class General extends TestBase{
		
	public static boolean isDisplayed(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		return  wait.until(ExpectedConditions.visibilityOf(webElement)).isDisplayed();
	}

	
}
