package day17b;

import org.testng.annotations.Test;
import org.testng.Reporter;
public class Demo1 {

	@Test
	public void mytest1()
	{
		System.out.println("MSG from SOP");//only in console
		Reporter.log("MSG from log");//only in HTML report
		Reporter.log("MSG from log1",false);//only in HTML report
		
		Reporter.log("MSG from log2",true);//print both in console &  in HTML report
	}
}
