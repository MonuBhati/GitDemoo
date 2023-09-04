package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

	public WebDriver driver;
	
	
	public  WebDriver WebDriverManager() throws IOException  {
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"//src/test//resources//global.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAurl");
	
	if(driver==null) {
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		ChromeOptions co=new ChromeOptions();
		co.setBrowserVersion("116");
		driver=new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(url);
	}
		return driver;
		
		
		
	}
	
	
}
