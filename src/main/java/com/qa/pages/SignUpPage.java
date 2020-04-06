package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.utils.TestBase;

public class SignUpPage extends TestBase{
	
	@FindBy(xpath = "//*[@id='email']")
	WebElement emailAddress;
	
	@FindBy (xpath = "//*[@id='country']//div[@class='menu']")
	WebElement CountryCode;

	@FindBy(xpath = "//*[@id='phone_number']")
	WebElement PhoneNum;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifySignUpPage() {
		return driver.getTitle();
	}
	
	public void enter_Email_Address() {
		emailAddress.sendKeys(prop.getProperty("email"));
		
	}
	
	public void select_Country_Code() {
		Select countryCode = new Select(CountryCode);
		countryCode.selectByVisibleText("countryCode)");
	}
	
	public void enter_Phone_Number() {
		PhoneNum.sendKeys(prop.getProperty("phoneNumber"));
	}
	
	public HomePage return_To_Login_Page() {
		driver.navigate().back();
		return new HomePage();
	}

}
