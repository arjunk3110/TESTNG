package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAndAfterTest
{
	@Test
	public void LoginTest()
	{
		System.out.println("This is First @TEST Method");
	}
	
	@Test
	public void LogOutTest()
	{
		System.out.println("This is Second @TEST Method");
	}
	
	@Test
	public void CloseTest()
	{
		System.out.println("This is Third @TEST Method");
	}
	
	
	
	@BeforeTest
	public void Before_Test()
	{
		System.out.println("BEFORE TEST");
	}
	
	
	@AfterTest
	public void After_Test()
	{
		System.out.println("AFTER TEST");
	}
	
	

}
