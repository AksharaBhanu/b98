package day18;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo8 extends BaseTest
{

	@Test(priority = 1)
	public void createUser()
	{
		Reporter.log("Create User",true);
	}
	
	
	@Test
	public void deleteUser()
	{
		Reporter.log("Delete User",true);
	}
}
