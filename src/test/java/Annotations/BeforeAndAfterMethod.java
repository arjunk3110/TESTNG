package Annotations;


import org.testng.annotations.*;

public class BeforeAndAfterMethod

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
	
	
	@BeforeMethod
	public void Before_Method()
	{
		System.out.println("BEFORE METHOD");
	}
	
	
	@AfterMethod
	public void After_Method()
	{
		System.out.println("AFTER METHOD");
	}
	
	

}
