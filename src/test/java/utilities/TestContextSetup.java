package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public  String ProductName;
	public PageObjectManager pageObjectManager;
	public TestBaseClass testBase;
	
	

	public TestContextSetup () throws IOException
	{
	  testBase = new TestBaseClass();
	  try {
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	}
}



