package testcases;

import java.util.List;

import org.openqa.selenium.By;

import com.qa.pages.DealsPage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DealsPageTest extends TestBase{
	
	LoginPage loginPage;
	DealsPage dealsPage;
	
	
	@Given("^User opens the browsers$")
	public void User_opens_the_browser() {
		TestBase.startApplication();
	}
	
	@Then("^User enters EmailId and password$")
	public void user_enters_Credentials(DataTable credentials) {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	} 

	@Then("^User clicks on Submit button$")
	public void user_clicks_on_Submit_button() {
		loginPage = new LoginPage();
		loginPage.user_clicks_on_Submit_button();
	}
			
	@Then("^User moves to new deals page$")
	public void User_moves_to_new_deals_page() {
		dealsPage = new DealsPage();
		dealsPage.User_moves_to_new_deals_page();
	}

	@Then("^User enters deals details$")
	public void user_enters_deals_details(DataTable dealsValues) {
		List<List<String>> dealValues = dealsValues.raw();
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(dealValues.get(0).get(0));
		driver.findElement(By.xpath("//div[@class='ui fluid container ']//textarea[@name='description']")).sendKeys(dealValues.get(0).get(1));
		}

	@Then("^User closes the Chrome browser$")
	public void user_close_the_browser() {
	    TestBase.closeBrowser(driver);
	}

}
