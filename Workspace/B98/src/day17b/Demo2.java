package day17b;
import org.testng.annotations.Test;
import org.testng.Reporter;
public class Demo2 {

	final int i=0;
	@Test(priority = i)
	public void registerUser()
	{
		Reporter.log("register user",true);
	}
	
	@Test(priority = 1)
	public void editeUser()
	{
		Reporter.log("edit user",true);
	}
	
	@Test(priority = 2)
	public void deleteUser()
	{
		Reporter.log("delete user",true);
	}
}
