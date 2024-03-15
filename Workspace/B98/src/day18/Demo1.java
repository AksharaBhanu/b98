package day18;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{

	@Test(invocationCount = 1)
	public void test1()
	{
		
		Reporter.log("test 1",true);
		
	}
	
}
