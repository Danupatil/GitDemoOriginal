package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignUp {
	public WebDriver driver;
	
	public SignUp(WebDriver driver)
	{
	 this.driver = driver;
	}
	
	By Name =     By.id("user_name");
	By Email =    By.id("user_email");
	By Password = By.id("password");
	By SignUp   = By.name("commit");
	By Register = By.xpath("/html/body/app-root/div/header/div[1]/div/div/div[2]/div[1]/a");
	By Message  = By.xpath("/html/body/main/div/div");
	By SuccessMessage = By.xpath("/html/body/div[1]/div[1]");
	//By Register = By.xpath("/html/body/app-root/div/header/div[2]/div/div/div[2]/div[2]/a");
	
    public boolean Checkthebutton()
    {
    	Boolean Check = driver.findElement(Register).isDisplayed();
    	System.out.println(Check);
    	return Check;
    }
	
	public void Register() throws InterruptedException
	
	{
		
		driver.findElement(Register).click();;
		//driver.findElement(By.xpath("/html/body/app-root/div/header/div[1]/div/div/div[2]/div[2]/a")).click();
	}
	public void SendFullName(String name)
	{
		driver.findElement(Name).sendKeys(name);
		
	}
	
    public void SendEmail(String email)
   {
		driver.findElement(Email).sendKeys(email);;
	}
    
    public void SendPassword(String password)
    {
 		driver.findElement(Password).sendKeys(password);
 	}
    
    public void DoSignUP()
    {
    	driver.findElement(SignUp).click();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	driver.findElement(By.xpath("/html/body/div[1]/div[1]")).isDisplayed();
    	/*if(driver.findElement(By.xpath("/html/body/div[1]/div[1]")).isDisplayed())
		{
			Assert.assertTrue(true);
		}
		else
		{
			 Assert.assertFalse(false);
		}
 	*/
    }
   
	
}
