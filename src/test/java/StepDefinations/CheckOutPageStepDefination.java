package StepDefinations;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObjects.CheckOutPage;
import PageObjects.LandingPage;
import io.cucumber.java.en.*;
import utils.TestContextSetup;

public class CheckOutPageStepDefination {
	
	//public WebDriver driver;
	public String OfferpageProductName;
	public String LandingPageproductname;
	TestContextSetup  textContextSetup;
	public CheckOutPage checkOutPage;
	
	
	public CheckOutPageStepDefination(TestContextSetup  textContextSetup) {//Constructor
		
		this.textContextSetup=textContextSetup;
		this.checkOutPage=textContextSetup.pageObjectManager.getCheckOutPage();

		
	}
	
	@Then("verify user has ability to enter promo code and place the order")
		public void verify_user_has_ability_to_enter_promo_code(){
		Assert.assertTrue(checkOutPage.verifyPromoBtn());
		Assert.assertTrue(checkOutPage.verifyPlaceOrder());
	}
		
	@Then("^User proceed to Chekcout and Validate the (.+) items in Chekcout Page$")
	public void User_proceed_to_Chekcout(String name) throws InterruptedException {
		
		checkOutPage.CheckOutItems();
		//Thread.sleep(3000);
		
		
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
