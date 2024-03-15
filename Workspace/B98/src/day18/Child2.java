package day18;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Child2 extends Parent
{
	@Test
	public void childTest2a()
	{
		Reporter.log("child @Test2a",true);
	}
	
	@Test
	public void childTest2b()
	{
		Reporter.log("child @Test2b",true);
	}
}
