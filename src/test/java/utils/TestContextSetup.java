package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.pageObjectManager;

public class TestContextSetup {

	
	public WebDriver driver;
	public Base base;
	public pageObjectManager pageobjectmanager;
	
	public TestContextSetup() throws IOException {
		
		base = new Base();
		pageobjectmanager= new pageObjectManager(base.WebDriverManager());
		
		
	}
	
	
}
