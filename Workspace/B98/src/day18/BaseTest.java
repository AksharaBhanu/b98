package day18;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
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
}
