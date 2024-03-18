package day19;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 {
	@BeforeMethod
	public void login()
	{
		Reporter.log(" login ",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log(" logout ",true);
	}

	@Test
	public void createUser()
	{
		Reporter.log(" Start ",true);
		Reporter.log(" createUser ",true);
		Assert.assertEquals("abcd", "xyz");//compare and report
		Reporter.log(" End ",true);
	}
	
	@Test
	public void editUser()
	{
		Reporter.log(" editUser ",true);
	}
}
