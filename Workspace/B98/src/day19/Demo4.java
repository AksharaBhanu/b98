package day19;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo4 {
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
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals("abcd", "xyz");//only compare
		Reporter.log(" End ",true);
		softAssert.assertAll();//report
		
	}
	
	@Test
	public void editUser()
	{
		Reporter.log(" editUser ",true);
	}
}
