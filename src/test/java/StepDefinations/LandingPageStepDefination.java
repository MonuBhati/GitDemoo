package StepDefinations;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObjects.LandingPage;
import io.cucumber.java.en.*;
import utils.TestContextSetup;

public class LandingPageStepDefination {
	
	//public WebDriver driver;
	public String OfferpageProductName;
	public String LandingPageproductname;
	TestContextSetup  textContextSetup;
	LandingPage landingPage;
	
	public LandingPageStepDefination(TestContextSetup  textContextSetup) {
		
		this.textContextSetup=textContextSetup;
		this.landingPage=textContextSetup.pageObjectManager.getLandingPage();

	}
	
	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() {
		   Assert.assertTrue(landingPage.getTittleLandingPage().contains("GreenKart"));
	}
	
	@When("^User searched with shortname (.+) and Extracted actual productname$")
	public void user_searched_with_shortname_and_extracted_actual_productname(String shortname) throws InterruptedException {
		
		//LandingPage landingPage=new LandingPage(textContextSetup.driver);
		landingPage.searchItem(shortname);
		 textContextSetup.LandingPageproductname=landingPage.getPrductName().split("-")[0].trim();

		//textContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
		System.out.println(LandingPageproductname  +" is extracted from landingPage");
		   Thread.sleep(2000);

	}
	
//	@When ("Added {string} Items of selected product to Cart")
//	public void Added_Items_product_to_Cart(String quantity) {
//		
//		landingPage.incrementQauantity(Integer.parseInt(quantity));
//		landingPage.addToCart();
//		
//	}
	
	@When("Added {int} Items of selected product to Cart")
	public void added_items_of_selected_product_to_cart(Integer int1) {
		landingPage.incrementQauantity(3);
		landingPage.addToCart();
	    
	
	}
}
