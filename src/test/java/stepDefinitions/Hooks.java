package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Orderpage;
import pageObjects.productPage;
import utils.TestContextSetup;

public class Hooks {

	
	public TestContextSetup testContextSetup;


	
	public Hooks(TestContextSetup testContextSetup) {
		
		this.testContextSetup=testContextSetup;
		

	}
	
	@After
	
	     public void closedriver() throws IOException {
			
		testContextSetup.base.WebDriverManager().quit();
		
	}
	
	@AfterStep
	
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		 WebDriver driver=testContextSetup.base.WebDriverManager();
		 
		 	File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 byte[] Screenshot=		FileUtils.readFileToByteArray(Source);
		 scenario.attach(Screenshot, "image/png","image");
	}
	    }
	
	
	
	
	
	
	

