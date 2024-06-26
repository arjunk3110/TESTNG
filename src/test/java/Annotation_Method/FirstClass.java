package Annotation_Method;

import org.testng.annotations.*;

public class FirstClass {

	

	@Test
	public void LoginTest()
	{
		System.out.println("This is FIRST Test Method");
	}
	

	@BeforeMethod
	public void Before_Test()
	{
		System.out.println("BEFORE METHOD");
	}
	
	
	@AfterMethod
	public void After_Test()
	{
		System.out.println("AFTER METHOD");
	}
	

}
