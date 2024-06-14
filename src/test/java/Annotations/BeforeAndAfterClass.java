package Annotations;

import org.testng.annotations.*;

public class BeforeAndAfterClass {

	

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
	
	
	@BeforeClass
	public void Before_Class()
	{
		System.out.println("BEFORE CLASS");
	}
	
	
	@AfterClass
	public void After_Class()
	{
		System.out.println("AFTER CLASS");
	}
	

	
}
