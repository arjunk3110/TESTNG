package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest
{

	public static String browser = "Chrome";
	 public static WebDriver driver;

	 
	  @BeforeMethod
	    public void BrowsersetUp() 
	    {
	    	if (browser.equals("Chrome"))
	    	{
	    	driver=new ChromeDriver();	
	    	}
	    	
	    	else if(browser.equals("Firefox"))
	    	{
	    		driver=new FirefoxDriver();	
	    	}
	    }
	
	 
	
	@AfterMethod
	public void BrowserClose()
	{
		
		driver.close();
	}

}
