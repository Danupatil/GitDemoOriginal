package stepDefinitions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utilities.TestContextSetup;

public class Hooks {
TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup)
	{
		
		this.testContextSetup = testContextSetup;
	}
	@After
	public void AfterScenario() throws IOException
	{
		
		testContextSetup.testBase.WebDriverManager().quit();
		
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver = testContextSetup.testBase.WebDriverManager();
		if((scenario).isFailed())
		{
			File Sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(Sourcepath);
			scenario.attach(fileContent,"image/png","image" );
		}
		
	}
}
