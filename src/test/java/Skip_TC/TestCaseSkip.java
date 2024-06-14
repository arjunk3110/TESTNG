package Skip_TC;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCaseSkip
{
	
	@Test(enabled=false)
	public void SkipTestOne()
	{
		System.out.println("SKIPPED TEST CASE");
	}

	@Test()
	public void SkipTestTwo()
	{
		
		System.out.println("Skipping This Test Forcefully");
		throw new SkipException("Skipping Forcefully");
	}
	
	@Test()
	public void Third()
	{
		System.out.println("HI IAM PRINTED ");
	}

	
}
