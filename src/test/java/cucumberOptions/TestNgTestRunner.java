package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features",glue="StepDefinations",monochrome=true,tags="@PlaceOrder or @OffersPage",
plugin={"html:target/cucumber.html","json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestNgTestRunner extends AbstractTestNGCucumberTests{
	
	
    @Override
    @DataProvider(parallel=true)
	public Object[][]scenarios(){
		return super.scenarios();
		
		
	}
	
	//To run one scenario at a time use [tags="PlaceOrder"] in cucumber options
    //we can generate html,json,xml,junit,extent report in cucumber
	
}
