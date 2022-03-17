package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseClass {
	
public WebDriver driver;

public  WebDriver WebDriverManager() throws IOException
{
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//configuration.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String url = prop.getProperty("QAUrl");
			
	if(driver == null)
	{
		if(prop.getProperty("Browser").equalsIgnoreCase("chrome"))
		{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
	driver = new ChromeDriver();// driver gets the life
		}
	
	driver.get(url);
	}
	
	return driver;
	

	}

}
