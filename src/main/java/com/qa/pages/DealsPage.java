package com.qa.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.utils.TestBase;
import com.qa.utils.General;

import cucumber.api.DataTable;

public class DealsPage extends TestBase {
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//*[@class='ui fluid large blue submit button']")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[@href='/deals']")
	WebElement dealsLink;
	
	@FindBy(xpath ="//a[@href='/deals/new']")
	WebElement dealsNewButton;
	
	@FindBy(xpath = "//input[@name='title']")
	WebElement title;
	
	@FindBy(xpath = "//div[@class='ui fluid selection dropdown']/i")
	WebElement AssignedTo;
	
	@FindBy(xpath = "//div[@class='react-datepicker-wrapper']//input")
	WebElement CloseDate;
	
	@FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--003 react-datepicker__day--outside-month']")
	WebElement SelectedCloseDate;
	
	@FindBy(xpath = "//div[@class='ui fluid container ']//textarea[@name='description']")
	WebElement Description;
	
	@FindBy(xpath="//div[@class='ui left labeled input']//input[@name= 'commission']")
	WebElement 	Commision;
	
	@FindBy(xpath = "//div[@name='status']")
	WebElement Status;
	
	@FindBy(xpath ="//label[@for='tags']//div[@role='combobox']")
	WebElement tags;
	
	public void user_is_already_on_login_page() throws InterruptedException {
		TestBase.startApplication();
	}
		
	//Initializing the page object
	public DealsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validate_userName() {
		return General.isDisplayed(email);
	}

	public void user_enters_Credentials(DataTable credentials) {
			List<List<String>> data = credentials.raw();
			email.sendKeys(data.get(0).get(0));
			password.sendKeys(data.get(0).get(1));
	}

	public void user_clicks_on_Submit_button() {
			loginButton.click();
	}
	
	public String User_is_on_Home_Page() {
		return driver.getTitle();
	}
	
	public void User_moves_to_new_deals_page() {
		dealsLink.click();
		dealsNewButton.click();
	}
	
	public void User_enters_deals_details(DataTable dealsValues) {
		List<List<String>> dealValues = dealsValues.raw();
		title.sendKeys(dealValues.get(0).get(0));
		AssignedTo.sendKeys(dealValues.get(0).get(1));
		//CloseDate.click();
		SelectedCloseDate.click();
		Description.sendKeys(dealValues.get(0).get(2));
		Commision.sendKeys(dealValues.get(0).get(3));
		Select dealsStatus = new Select(Status);
		dealsStatus.selectByVisibleText(dealValues.get(0).get(4));
		tags.sendKeys(dealValues.get(0).get(5));
		tags.sendKeys(Keys.ENTER);
			
	}

}
