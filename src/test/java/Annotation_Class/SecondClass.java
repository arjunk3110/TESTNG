package Annotation_Class;

import org.testng.annotations.Test;

public class SecondClass extends FirstClass 
{
	

	@Test
	public void LoginTest()
	{
		System.out.println("This is SECOND Test Method");
	}


	@Test
	public void LoginTest1()
	{
		System.out.println("This is THIRD Test Method");
	}

}
