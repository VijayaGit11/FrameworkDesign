package testcases;

import java.util.Map;

import org.openqa.selenium.By;

import com.qa.pages.ContactsPage;
import com.qa.utils.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactsPageTest extends TestBase {

	ContactsPage contactPage;
	
	@Given("^User open browser and launch Free CRM$")
	public void user_open_browser_and_launch_Free_CRM() {
	    TestBase.startApplication();
	}

	@Then("^User login to Free CRM$")
	public void user_login_to_Free_CRM(DataTable credentials) {
	    contactPage = new ContactsPage();
	    for (Map<String, String> data : credentials.asMaps(String.class, String.class)) 
	    {
	    driver.findElement(By.name("email")).sendKeys(data.get("username"));
	    driver.findElement(By.name("password")).sendKeys(data.get("password"));
	    driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
	   	}
	}    

	@Then("^User moves to new Contacts page$")
	public void user_moves_to_new_Contacts_page() throws InterruptedException {
		contactPage = new ContactsPage();
	    contactPage.User_moves_to_new_Contacts_page();	    
	}

	@Then("^User fills below details$")
	public void user_fills_below_details(DataTable contactDetails) throws InterruptedException {
		contactPage = new ContactsPage();
	    for (Map<String, String> data : contactDetails.asMaps(String.class, String.class)) 
	    {
	    driver.findElement(By.name("first_name")).sendKeys(data.get("FirstName"));
	    driver.findElement(By.name("last_name")).sendKeys(data.get("LastName"));
	   		    
	   	driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
	   	Thread.sleep(30);
	   	driver.findElement(By.xpath("//a[@href='/contacts']")).click();
	   	Thread.sleep(30);
	    driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();
	    }
	}

	@Then("^user quits from application$")
	public void user_quits_from_application() {
	    TestBase.closeBrowser(driver);
	    
	}
}
