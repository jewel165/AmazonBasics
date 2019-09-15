package push01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Config {

	WebDriver driver;
	
	@BeforeSuite
	
	public void setupbrowser()	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdala\\Documents\\GitHub\\AmazonBasics\\Drivers");
	}
	
	@BeforeClass
	
	public void openbrowser()	{
		driver = new ChromeDriver();
	}

	
//	@BeforeTest
	
//	public void login()	{
		
//	}
	
	@BeforeMethod

	public void seturl()	{
		
		
		driver.get("www.amazon.com");
	}

	
	@AfterTest
	
	public void closebrowser() {
		
		driver.close();
	}
}	

