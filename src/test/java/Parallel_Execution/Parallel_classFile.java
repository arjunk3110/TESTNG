package Parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel_classFile 
{
	
	 public static String browser = "Chrome";
	 public static WebDriver driver;
	    

	@Test  (priority=4,groups="regression")
	public void FirstTC()
	{
		if (browser.equals("Chrome"))
		{
           driver = new ChromeDriver();
           
       } 
		else if (browser.equals("Firefox"))
		{
           driver = new FirefoxDriver();
       }
		
		System.out.println("First Test Case");
	}
		
	
	@Test(priority=3,groups="regression")
	public void SecondTC()
	{
		System.out.println("Second Test Case");
	}

}
