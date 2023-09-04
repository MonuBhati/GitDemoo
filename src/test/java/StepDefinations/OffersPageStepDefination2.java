package StepDefinations;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OffersPage;
import PageObjects.PageObjectManager;
import io.cucumber.java.en.*;
import utils.TestContextSetup;

public class OffersPageStepDefination2 {
	//public WebDriver driver;
	public String offerspageProductName;
	public String LandingPageproductname;
	TestContextSetup  textContextSetup;
	PageObjectManager pageObjectManager;
	
	public OffersPageStepDefination2(TestContextSetup  textContextSetup){ //constructor
		this.textContextSetup = textContextSetup;	
	}
	
	@Then("^User searched for (.+) shortname in offers page$")
	public void user_searched_for_shortname_in_offers_page(String shortname) throws InterruptedException {	
		switchToOffersPage();
		OffersPage offersPage=new OffersPage(textContextSetup.pageObjectManager.driver);
		offersPage.searchItem(shortname);
		Thread.sleep(3000);		                                
	offerspageProductName=offersPage.getPrductName();
	offersPage.getText();

	System.out.println(offerspageProductName  +" is extracted from OffersPage");

	}
	
	public void switchToOffersPage() {
		//single resposnibility principle -whenever we want to switch between windows we simply call this method
		
		//pageObjectManager=new PageObjectManager(textContextSetup.driver);
		//LandingPage landingPage=textContextSetup.pageObjectManager.getLandingPage();
		LandingPage landingPage=textContextSetup.pageObjectManager.getLandingPage();
		landingPage.selectTopDealsPage();
		textContextSetup.genericUtils.SwitchWindowToChild();
		textContextSetup.pageObjectManager.getOffersPage();
		
	}

//	@Then("Validate product name in offers page matches with landing page")
//	public void validate_product_name_in_offers_page_matches_with_landing_page() {
//		
//		
//		Assert.assertEquals(textContextSetup.OfferpageProductName, textContextSetup.LandingPageproductname);
//	    
//	}
	
	
	
}
