package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class productPage {

	public WebDriver driver;
	public productPage(WebDriver driver) {
		
		this.driver=driver;
	}
	By search = By.xpath("//input[@type='search']");
	By increment=By.cssSelector(".increment");
	By addtocart=By.cssSelector(".product-action button");
	By bag = By.cssSelector("img[alt='Cart']");	
	By checkout=By.xpath("//div//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	
	
	public void sendsearch(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public void clearsearch() {
		driver.findElement(search).clear();
	}
	
	
	

	public void sendincrement(int quantity) throws InterruptedException {
		
		int i = quantity-1;
		while(i>0)
		{
			driver.findElement(increment).click();
			i--;
			
		}
		driver.findElement(addtocart).click();
		Thread.sleep(2000);
		
	}
		
	
	
	public String gettitle() {
		
		return driver.getTitle();
	}
	
	
	
	public void Checkoutbuttons() {
		driver.findElement(bag).click();
		driver.findElement(checkout).click();
	}
}
	
		
		
		