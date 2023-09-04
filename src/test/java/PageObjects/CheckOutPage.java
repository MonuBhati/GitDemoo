package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	public WebDriver driver;
	
	public CheckOutPage(WebDriver driver) {//constructor
		this.driver=driver;
	}
	
    By cartBag=By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img");
    By checkOutButton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
    By promoBtn=By.cssSelector(".promoBtn");
    By placeOrder=By.xpath("//button[contains(text(),'Place Order')]");
    
	
	
	
	public void CheckOutItems() {
		
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();
		
	}
	
	public Boolean verifyPromoBtn() {
		
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public Boolean verifyPlaceOrder() {
		
		return driver.findElement(placeOrder).isDisplayed();
	}
}
