package Annotation_Method;

import org.testng.annotations.Test;

public class SecondClass extends FirstClass 
{
	

	@Test
	public void LoginTest()
	{
		System.out.println("This is Second Test");
	}


	@Test
	public void LoginTest1()
	{
		System.out.println("This is Third Test");
	}

}
