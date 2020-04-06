package testcases;

import org.openqa.selenium.By;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homePage;
	
	@Given("^User is already on Login screen$")
	public void user_is_already_on_Login_page() {
		TestBase.startApplication();
    
	}

//	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String email, String pswd) {
//		LoginPage loginPage = new LoginPage();
//	    loginPage.user_enters_and(email, pswd);  
//	}
	
	@Then("^User enters username and password$")
	public void User_Enters_Username_Password() {
		driver.findElement(By.name("email")).sendKeys("vijaya.zambre@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Freecrm#11");
	}

	@Then("^User clicks on submit button$")
	public void user_clicks_on_submit_button() {  
		loginpage = new LoginPage();
	    homePage = loginpage.user_clicks_on_Submit_button();
	}
	
	@Then("^User closes the browser$")
	public void User_closest_the_browser() {
		TestBase.closeBrowser(driver);
	}

}
