package Annotation_Suite;

import org.testng.annotations.*;

public class FirstClassSuite {

	

	@Test
	public void LoginTest()
	{
		System.out.println("This is First Test");
	}
	

	@BeforeSuite
	public void Before_Test()
	{
		System.out.println("BEFORE SUITE");
	}
	
	
	@AfterSuite
	public void After_Test()
	{
		System.out.println("AFTER SUITE");
	}
	

}
