package Parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Common.BaseTest;

public class Parameter  extends BaseTest
{
		  
	@Test
	@Parameters({"UserName","Password"})
	public void login(String UserName,String Password) throws InterruptedException
	{
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.MINUTES);
			
		  driver.findElement(By.id("user-name")).sendKeys(UserName);
		  driver.findElement(By.id("password")).sendKeys(Password);
		  driver.findElement(By.id("login-button")).click();
		  
		  Thread.sleep(300);
		  driver.findElement(By.xpath(" //button[@id='react-burger-menu-btn']  ")).click();
		  driver.findElement(By.xpath(" //a[@id='logout_sidebar_link']  ")).click();	
	}	
}

