package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class OffersPage {
		
		public WebDriver driver;
		
	By search =By.xpath("//input[@type='search']");	
    By productName= By.cssSelector("tr td:nth-child(1)");	
    
			public OffersPage(WebDriver driver) {//constructor
				this.driver=driver;
			}
			
									
			public void searchItem(String name) {
				
				//driver.findElement(search).sendKeys(name);
				driver.findElement(search).sendKeys(name);
				//return;
			}
			
		public void getText() {
				
				driver.findElement(search).getText();
				
			}
			
			
		public String getPrductName() {
			
			return driver.findElement(productName).getText();		
		}
}
