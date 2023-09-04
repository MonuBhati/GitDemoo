package StepDefinations;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import utils.TestContextSetup;

public class Hooks {
	Scenario scenario;
	
	TestContextSetup testContextSetup;
	public Hooks(TestContextSetup testContextSetup) {
		
		this.testContextSetup=testContextSetup;
	}
	
	@After
	public void AfterScenario() throws IOException {
		
		testContextSetup.testBase.WebDriverManager().quit();
	}
	
//	@AfterStep
//	public void AddScreenShot(Scenario scenario, Object TakeScreenshot) {
//		
//		WebDriver driver=testContextSetup.testBase.WebDriverManager();
//		
//		if (((Object) scenario).isFailed()) {
//			File sourcepath=((TakeScreenshot).(driver).getScreenshotAs(OutputType.FILE));
//			
//		}
//		
//		System.out.println("am here ");
//	}
	
	
	
	

}
