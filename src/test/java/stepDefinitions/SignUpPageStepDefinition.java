package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SignUp;
import utilities.TestContextSetup;

public class SignUpPageStepDefinition {
	
	WebDriver driver;
	public TestContextSetup testContextSetup;
	
	SignUp signup;
	public SignUpPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
	}
	
	
	@Given("User land on portal homepage")
	public void user_land_on_portal_homepage() throws IOException {
		signup = testContextSetup.pageObjectManager.SignUp();	
		//testBase = new TestBaseClass();
		//testBase.WebDriverManager();
	
	/*System.setProperty("webdriver.chrome.driver","C:\\Users\\daneshwari.patil\\eclipse-workspace\\AutomationFramework\\src\\test\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com");*/
	}
	@When("User want to register and clicked on register link")
	public void user_want_to_register_and_clicked_on_register_link() throws InterruptedException {
		//testContextSetup.driver.findElement(By.xpath("/html/body/app-root/div/header/div[1]/div/div/div[2]/div[1]/a")).click();
		
		 //signup = new SignUp(testContextSetup.driver);
		
		signup.Register();
		
	  //driver.findElement(By.xpath("/html/body/app-root/div/header/div[1]/div/div/div[2]/div[1]/a")).click();
	}
	 @Then("^User add (.+) and (.+) and (.+)$")
	    public void user_add_and_and(String fullname, String email, String password) throws Throwable {
		 //SignUp signup = testContextSetup.pageObjectManager.SignUp();
		 signup.SendFullName(fullname);
		 signup.SendEmail(email);
		 signup.SendPassword(password);
	    // driver.findElement(By.id("user_name")).sendKeys(fullname);
	     //driver.findElement(By.id("user_email")).sendKeys(email);
	    // driver.findElement(By.id("password")).sendKeys(password);
	    }
	@Then("User click on signup")
	public void user_click_on_signup() {
		
	signup.DoSignUP();
	/* Assert.assertFalse(signup.DoSignUP());
	 if(signup.DoSignUP().booleanValue() == false)
	 {
		 System.out.println("User already exists");
	 }
	 else
	 {
		 System.out.println("SignUp was successful");
	 }*/
			
	
	   // driver.findElement(By.name("commit")).click();
	}

}
