package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class LoginPage extends TestBase{
		
//	@FindBy(name = "username")
//	WebElement email;

	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
//	@FindBy(xpath = "//div[@class='input-group-btn']/input")
//	WebElement loginButton;
	
	@FindBy(css = ".ui.fluid.large.blue.submit.button")
	WebElement loginButton;
	
	@FindBy(xpath = "//span[@class='trial-indicator']/a")
	WebElement accountTitle;
	
	@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']//a[text()='Sign Up']")
	WebElement signUpButton;
	
	@FindBy(xpath = "//a[@href='/deals']")
	WebElement dealsLink;
	
	//Initializing the page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
//	public String validateLoginTitle() {
//		return driver.getTitle();
//	}
//	
//	public boolean validate_userName() {
//		return General.isDisplayed(email);
//	}

	public void user_enters_and(String mail, String pwd) {
			email.sendKeys(mail);
			password.sendKeys(pwd);	
			
}

	public HomePage user_clicks_on_Submit_button() {
			loginButton.click();	
			return new HomePage();

	}
	
//	public String User_is_on_Home_Page() {
//		System.out.println("Page title is "+ driver.getTitle());
//		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", driver.getTitle() );
//		return driver.getTitle();
//	}
	
//	public void validate_SignUpPage() {
//		if(General.isDisplayed(signUpButton)) {
//			signUpButton.click();
//		}
//		else {
//			System.out.println("Unable to find signUp button");
//		}
//	}

	
//	public void  User_clicks_on_Sign_up_link() {
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js. executeScript("arguments[0]. click();", signUpButton);
//			}
//	
//	public void User_moves_to_dealsPage() {
//		dealsLink.click();
//		
//	}
//	
////		public void user_close_the_browser() {
////		//driver.quit();
////		BaseClass.closeBrowser(driver);
////	}
//	
}