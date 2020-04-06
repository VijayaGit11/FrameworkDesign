package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//a[@class='navbar-brand']//img[@src='https://classic.freecrm.com/img/logo.png']")
	@CacheLookup
	WebElement CRMPRO_LOGO;
		
	@FindBy(xpath="//div[@class='right menu']//span[@class='user-display']")
	WebElement userName;
	
	@FindBy(xpath="//a[contains(text(), 'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(), 'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(), 'Tasks')]")
	WebElement tasksLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Is_CRMPRO_Logo_Present() {
		return CRMPRO_LOGO.isDisplayed(); 
	}
	
	public String verifyHomePage() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUsernam() {
		return userName.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].click();", contactsLink);
		//contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTaskLink() {
		tasksLink.click();
		return new TasksPage();
	}
	
}