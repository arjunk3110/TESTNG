package Annotation_Test;

import org.testng.annotations.*;

public class FirstClass {

	

	@Test
	public void LoginTest()
	{
		System.out.println("This is First Test");
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
