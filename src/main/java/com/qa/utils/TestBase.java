package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:/Users/HP/Documents/Framework/Framework/src/main/java/com/qa/config/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	
	public static void startApplication() {
		String BrowserName = prop.getProperty("browser");
		
		if (BrowserName.equalsIgnoreCase("fireforx")) {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("geckodriver"));
			driver = new FirefoxDriver();
		}
		
		else if (BrowserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriver"));
			driver = new ChromeDriver();
		}
		
		else if (BrowserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", prop.getProperty("iedriver"));
			driver = new InternetExplorerDriver();
		}
		
		else {
			System.out.println("We do not support thid browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.pageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(TestUtil.implicitlyWait, TimeUnit.SECONDS);	
		
	}
	
	
	public static WebDriver closeBrowser(WebDriver driver) {
		driver.quit();
		return driver;
	}
	

}
