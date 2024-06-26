package Annotation_Class;

import org.testng.annotations.*;

public class FirstClass {

	

	@Test
	public void LoginTest()
	{
		System.out.println("This is FIRST Test Method");
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
