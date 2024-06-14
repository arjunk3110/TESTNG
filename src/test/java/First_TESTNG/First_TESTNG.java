package First_TESTNG;

import org.testng.annotations.Test;

public class First_TESTNG

{
	@Test (priority=2)
	public void LoginTest()
	{
		System.out.println("Login Success");
	}
	
	
	@Test(priority=1)
	public void LogOutTest()
	{
		System.out.println("Logout Success");
	}
	
	

}
