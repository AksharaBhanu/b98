package day18;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo2 
{

	@DataProvider
	public String[] getData()
	{
		String[] data=new String[3];
		data[0]="Akash";
		data[1]="Bhumi";
		data[2]="Chandra";
		
		return data;
	}
	
	@Test(dataProvider = "getData" )
	public void test1(String un)
	{
		
		Reporter.log("Create User:"+un,true);
		
	}
	
	
	
	
}
