package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Hooks_Demo_Test {
	
	WebDriver driver;
	DealsPageTest dealsPageTest;
		
//	@Before()
//	public void setUp() {
//		System.out.println("Started");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Framework\\Framework\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.pageLoadTimeout, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get("https://ui.freecrm.com/");
//		driver.manage().timeouts().implicitlyWait(TestUtil.implicitlyWait, TimeUnit.SECONDS);
//	}
	
	@Given("^User is on deals page$")
	public void user_is_on_deals_page() {
		driver.findElement(By.name("email")).sendKeys("vijaya.zambre@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Freecrm#11");
		driver.findElement(By.cssSelector(".ui.fluid.large.blue.submit.button")).click();
		driver.findElement(By.xpath("//a[@href='/deals']")).click();
		driver.findElement(By.xpath("//a[@href='/deals/new']")).click();
	    
	}

	@Then("^User fills the deals form$")
	public void user_fills_the_deals_form() {
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Mrs");
		driver.findElement(By.xpath("//div[@class='ui fluid container ']//textarea[@name='description']")).sendKeys("Hooks Demo");
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
	}

	@Then("^Deal is created$")
	public boolean deal_is_created() {
		return driver.findElement(By.xpath("//div[@class='ui fluid container main-content']//div[text()='Title']")).isDisplayed();
	    
	}
	
//	@After()
//	public void tearDown() {
//		driver.quit();
//		System.out.println("Ended");
//		//TestBase.closeBrowser(driver);
//	}

}
