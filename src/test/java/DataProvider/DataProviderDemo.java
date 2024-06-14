package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

			
	@Test(dataProvider="create")
	public void set1(String UserName,String Password)
	{
	System.out.println(UserName+"-----"+Password);
	}

	
	
	@DataProvider(name="create")
	public Object[][] dataset()
	{
		return new Object[][]
				{
		{"UN1","PSWRD1"},
		{"UN2","PSWRD2"}
				};
	}
	

	
}
