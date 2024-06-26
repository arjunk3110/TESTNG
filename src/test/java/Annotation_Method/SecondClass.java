package Annotation_Method;

import org.testng.annotations.Test;

public class SecondClass extends FirstClass 
{
	

	@Test
	public void Enterdata()
	{
		System.out.println("This is SECOND Test Method");
	}


	@Test
	public void Logout()
	{
		System.out.println("This is THIRD Test Method");
	}

}
