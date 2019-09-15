package push01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonFeaturesTest {
	
	 public WebDriver driver;
	
	@BeforeMethod
	
	public void setup()	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdala\\eclipse-workspace\\DEC_2018\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://wwww.amazon.com");
	}
	
	@Test
	
	public void gettille()	{
	String tille=	driver.getTitle();
	System.out.println(tille);
	}

	@AfterMethod

	public void closebrowser()	{
	driver.quit();
	}

	
}	
	