package pageObjects;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {

	public WebDriver driver;
	public productPage productpage;
	public Orderpage orderpage;

	public pageObjectManager(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public productPage getproductPage() {
		
		productpage = new productPage(driver);
		return productpage;
	}
	
public Orderpage getorderpage() {
		
	orderpage = new Orderpage(driver);
		return orderpage;
	}
	
	
}
