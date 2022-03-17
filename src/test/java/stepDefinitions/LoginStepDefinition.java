package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.Login;
import pageObjects.PageObjectManager;
import utilities.TestContextSetup;

public class LoginStepDefinition {
	WebDriver driver;
	public TestContextSetup testContextSetup;
	Login login;
	public LoginStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
		 this.login = testContextSetup.pageObjectManager.Login();
	}
	
	@Given("^User is on Homepage Portal $")
    public void user_is_on_homepage_portal() throws Throwable {
	 
		login.ClickLogin();
        
    }

    @When("^User clicks on Login button and enter login details (.+) and (.+)$")
    public void user_clicks_on_login_button_and_enter_login_details_and(String email, String password) throws Throwable {
    	login.ClickLogin();
    	login.SendEmail(email);
    	login.SendPassword(password);
    	login.LoginBtn();
    	
        
    }

    @And("^User click on login$")
    public void user_click_on_login() throws Throwable {
   	 
   	      
    }	
}
