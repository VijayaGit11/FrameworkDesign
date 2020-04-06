package testcases;

import com.qa.pages.HomePage;
import com.qa.utils.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	
//	@Given("^User is already on Login screen$")
//	public void user_is_already_on_Login_page() {
//		BaseClass.startApplication();
//	    
//	}
//
//	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String email, String pwd) {
//		loginPage = new LoginPage();
//	    loginPage.user_enters_and(email, pwd);  
//	}
//
//	@Then("^user clicks on submit button$")
//	public void user_clicks_on_submit_button() {    
//	    loginPage.user_clicks_on_Submit_button();
//	}
	
	@Given("^User is on home page$")
	public String User_Is_On_HomePage(){
		return homePage.verifyHomePage();
	}

	@Then("^User navigates to contacts page$")
	public void user_clicks_contacts_Link() {
		homePage = new HomePage();
	    homePage.clickOnContactsLink();
	    
	}
	
	@Then("^User navigates to deals page$")
	public void user_clicks_on_deals_Link() {
		homePage = new HomePage();
	    homePage.clickOnDealsLink();
	    
	}


	@Then("^User navigates to tasks page$")
	public void user_clicks_on_tasks_Link() {
		homePage = new HomePage();
	    homePage.clickOnTaskLink();
	    
	}
	
//	@Then("^User closes the browser$")
//	public void user_closes_the_browser() {
//		TestBase.closeBrowser(driver);
//
//	}

}
