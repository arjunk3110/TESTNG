package Failed_TC_ScreenCapture;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ScreenCapture 
{

	public static WebDriver driver;

    @BeforeMethod
    @Parameters({ "browser" })
    public void setup(String browser)
    {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    
 @Test
    public void formDemo()
    {
	  
	
	 
	  driver.manage().window().maximize();
	  driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
	  
	  driver.findElement(By.id("user-message")).sendKeys("India");
	  driver.findElement(By.xpath("  //button[@id='showInput'] ")).click();	  
	  
	  String ActualMessage=driver.findElement(By.id("message")).getText();
	  Assert.assertEquals(ActualMessage, "India00","The message displayed is not as expected.");
    }

    
    @AfterMethod
    public void TakeScreenShort(ITestResult testResult) throws IOException
    {
    	
    	 if(testResult.FAILURE==testResult.getStatus())
    	 {
    		 Date currentdate= new Date();
             // System.out.println(currentdate);
              String ScreenshotFileName=currentdate.toString().replace("","-").replace(":"," -");
              System.out.println(ScreenshotFileName);
              
              //TAKE SCREENSHORT
              TakesScreenshot screenshot = (TakesScreenshot) driver;
              File source = screenshot.getScreenshotAs(OutputType.FILE);
              
              //STORE IN THE PROJECT DIRECTORY
              FileUtils.copyFile(source, new File(".//screenshot//"+ScreenshotFileName+".png"));
      }
    	 }
    	 

    

}
