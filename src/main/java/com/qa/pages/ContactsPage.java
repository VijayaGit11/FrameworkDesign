package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath = "//a[@href='/contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[@href='/contacts/new']")
	WebElement contactsNew;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void User_moves_to_new_Contacts_page() throws InterruptedException {
		contactsLink.click();
		contactsNew.click();
		
	}
	

}
