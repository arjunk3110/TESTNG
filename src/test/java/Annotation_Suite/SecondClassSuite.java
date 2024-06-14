package Annotation_Suite;

import org.testng.annotations.Test;

public class SecondClassSuite extends FirstClassSuite 
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
