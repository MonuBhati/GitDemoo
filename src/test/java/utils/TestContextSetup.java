package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetup {
   
	public WebDriver driver;
	public String OfferpageProductName;
	public String LandingPageproductname;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	
	
	public TestContextSetup() throws IOException {
		
		
	testBase=new TestBase();
	pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
	genericUtils=new GenericUtils(testBase.WebDriverManager());
	
	}
	
	
	
	
	
	
	
}
