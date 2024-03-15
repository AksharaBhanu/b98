package day18;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo6 
{
	
	@DataProvider
	public Object[] getData()
	{
		Object[] data=new Object[3];
		data[0]="Akash";
		data[1]=123;
		data[2]=true;
		
		return data;
	}
	
	@Test(dataProvider = "getData" )
	public void test1(Object a)
	{
		
		Reporter.log("Data:"+a,true);
		
	}
	
	
	
	
}
