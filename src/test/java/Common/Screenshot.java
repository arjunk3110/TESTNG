package Common;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot extends BaseTest
{
	
	public static String browser = "Chrome";
    public static WebDriver driver;
    

	public static void main(String[] args) throws InterruptedException, IOException
	{
		if (browser.equals("Chrome"))
		{
            driver = new ChromeDriver();
            
        } 
		
		else if (browser.equals("Firefox"))
		{
            driver = new FirefoxDriver();
        }
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://www.ebay.com/");
        
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
