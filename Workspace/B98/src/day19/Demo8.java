package day19;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo8 {

	@Test(priority = 2)
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
		Assert.assertEquals("abc","xyz");
		
	}
	
	@Test(priority = 1,dependsOnMethods = "createCustomer")
	public void deleteCustomer()//delete customer only when create customer is PASSED
	{
		Reporter.log("deleteCustomer",true);
	}
}
