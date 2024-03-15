package day18;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Child1 extends Parent
{
	@Test
	public void childTest1()
	{
		Reporter.log("child @Test1",true);
	}
}
