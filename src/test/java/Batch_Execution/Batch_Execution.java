package Batch_Execution;

import org.testng.annotations.Test;

public class Batch_Execution
{
	

	@Test  (priority=4,groups="regression")
	public void FirstTC()
	{
		System.out.println("First Test Case");
	}
		
	
	@Test(priority=3,groups="regression")
	public void SecondTC()
	{
		System.out.println("Second Test Case");
	}


}
