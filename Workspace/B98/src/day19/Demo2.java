package day19;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {

	
	@Test
	public void test()
	{
		
		Reporter.log("open the browser",true);
		Reporter.log("ente url",true);
		Reporter.log("enter un",true);
		Reporter.log("enter pw",true);
		Reporter.log("click login",true);
		String expectedPage="HomePage";
		String actualPage="LoginPage";
//		if(actualPage.equals(expectedPage))
//		{
//			Reporter.log("Home page is displayed:PASS",true);
//			
//		}
//		else
//		{
//			Reporter.log("Home page is NOT displayed:FAIL",true);
//			Assert.fail();
//		}
		Assert.assertEquals(actualPage, expectedPage);
		
	}
}
