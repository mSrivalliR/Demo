package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.Orderpage;
import pageObjects.productPage;
import utils.TestContextSetup;

public class productPageStepDefinition {

	
	public TestContextSetup testContextSetup;
	public productPage productpage;
	
	
	public productPageStepDefinition(TestContextSetup testContextSetup) {
		
		this.testContextSetup=testContextSetup;
		this.productpage  = testContextSetup.pageobjectmanager.getproductPage();
	}
	
	
	
	
	
	@Given("User is on Greenkart page")
    public void user_is_on_greenkart_page() throws Throwable {
			Assert.assertTrue(productpage.gettitle().contains("GreenKart"));
	
    }

	@When("^User orders (.+) vegetables with mentioned (.+)$")
    public void user_orders_vegetables_with_both(String pname, String pquantity) throws Throwable {
	
				
		productpage.sendsearch(pname);
    	Thread.sleep(2000);
    	int number=Integer.parseInt(pquantity);
    	productpage.sendincrement(number);
    	Thread.sleep(2000);
    }
	
	
	
    @When("User orders {string} vegetables with {string}")
    public void user_orders_vegetables_with(String name, String quantity) throws Throwable {
    	

    	productpage.sendsearch(name);
    	Thread.sleep(2000);
    	int number=Integer.parseInt(quantity);
    productpage.sendincrement(number);
    	Thread.sleep(2000);
    	productpage.clearsearch();
    	

       
    }

    @When("user proceeds to checkout")
    public void user_proceeds_to_checkout() throws Throwable {

    	productpage.Checkoutbuttons();
    	
    }
	
	
	
	
}
