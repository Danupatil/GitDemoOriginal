package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public SignUp signUp;
	public Login login;
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	public SignUp SignUp()
	{
		signUp = new SignUp(driver);
		return signUp;
	}
	public Login Login()
	{
		login = new Login(driver);
		return login;
	}
	
	
}
