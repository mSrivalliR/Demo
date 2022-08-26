package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver driver;
	
		
	public WebDriver WebDriverManager() throws IOException {
		
		
		Properties prop=new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//config.properties");
		
		prop.load(fis);
		
		String browser_properties=prop.getProperty("browser");
		String url=prop.getProperty("url");
		String maven_browser=System.getProperty("browser");
		
		String browser = maven_browser!=null ? maven_browser : browser_properties ;
		
		
		if(driver==null) {
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
				driver=new ChromeDriver();
			}	
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe");
				driver=new FirefoxDriver();

			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
		}
		
		
		return driver;
		
		
		
		
	}
	
}
