package day18;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo7 {

	
	@BeforeClass
	public void open()
	{
		Reporter.log("Open the Browser",true);
	}
	
	@AfterClass
	public void close()
	{
		Reporter.log("Close the browser",true);
	}
	
	@BeforeMethod//before every test iteration
	public void login()
	{
		Reporter.log("Login",true);
	}
	
	@AfterMethod//after every test iteration
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
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
