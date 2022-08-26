package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Orderpage;
import pageObjects.productPage;
import utils.TestContextSetup;

public class orderPageStepDefinition {

	
	public TestContextSetup testContextSetup;
	public Orderpage orderpage;
	public productPage productpage;

	
	public orderPageStepDefinition(TestContextSetup testContextSetup) {
		
		this.testContextSetup=testContextSetup;
		this.orderpage  = testContextSetup.pageobjectmanager.getorderpage();
		this.productpage  = testContextSetup.pageobjectmanager.getproductPage();

	}
	
	
	 @Then("user clicks place order and selects country {string} and terms of conditions and clicks Proceed")
	    public void user_clicks_place_order_and_selects_country_and_terms_of_conditions(String country) throws Throwable {
		 
		 orderpage.placeorder();
		 Thread.sleep(2000);
		 orderpage.selectcountry(country);
		 orderpage.agreement();
	    }
	 
	 

	    @Then("user verifies if the order placed and returns to homepage")
	    public void verifies_if_the_order_placed_sucessfully_msg_is_displayed() throws Throwable {
	    	
	    	
	    	
			Thread.sleep(7000);
			Assert.assertTrue(productpage.gettitle().contains("GreenKart"));

	    	
	    }
	
	
	
	
	
	
	
}
