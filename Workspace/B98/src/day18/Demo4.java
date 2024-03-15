package day18;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo4 
{

	@DataProvider
	public Iterator<String> getData()
	{
		ArrayList<String> data=new ArrayList<String>();
		data.add("Akash");
		data.add("Bhumi");
		data.add("Chandra");
		Iterator<String> iData = data.iterator();
		
		return iData;
	}
	
	@Test(dataProvider = "getData" )
	public void test1(String un)
	{
		
		Reporter.log("Create User:"+un,true);
		
	}
	
	
	
	
}
