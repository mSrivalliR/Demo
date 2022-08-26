package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Orderpage {

	public WebDriver driver;
	public Orderpage(WebDriver driver) {
		
		this.driver=driver;
	}
	By placeorder=By.xpath("//button[contains(text(),'Place Order')]");
	By select=By.xpath("//div//select");
	By termsbox=By.xpath("//input[@type='checkbox']");
	By proceed=By.xpath("//button[contains(text(),'Proceed')]");
	By msg=By.xpath("//span[contains(text(),'Your order has been placed')]");
	
	public void placeorder() {
		
		driver.findElement(placeorder).click();;
		}
	
	

	public void selectcountry(String country) {
		
		Select obj= new Select(driver.findElement(select));
		obj.selectByValue(country);
		}
	
	
public void agreement() {
		
		driver.findElement(termsbox).click();
		driver.findElement(proceed).click();
		
		
		}
	

public boolean msgdisplay() {
	
	
	return driver.findElement(msg).isDisplayed();
	}

}
	
		
		
		