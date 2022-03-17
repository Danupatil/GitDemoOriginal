package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login {
	
	public WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver= driver;
	}
   
	By Login = By.xpath("/html/body/app-root/div/header/div[1]/div/div/div[2]/div[2]/a");
	By email = By.id("email");
	By password  = By.id("password");
	By LoginBtn = By.xpath("/html/body/main/div/form/div[4]/input");
	By ErrorMessage = By.xpath("/html/body/main/div/div");
	By SuccessMessage = By.xpath("/html/body/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[9]/a/span");
	
	
	
	public void ClickLogin()
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(Login).click();
	}
	
	public void SendEmail(String mail)
	{
		driver.findElement(email).sendKeys(mail);
	}
	public void SendPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void LoginBtn()
	{
		driver.findElement(LoginBtn).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//String errorMessage = driver.findElement(ErrorMessage).getText();
		//String result ="Your email or password is incorrect.";
		if(driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[9]/a/span")).isDisplayed())
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
	}
}
