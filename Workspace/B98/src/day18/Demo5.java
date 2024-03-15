package day18;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo5 
{

	@DataProvider
	public Iterator<String[]> getData()
	{
		ArrayList<String[]> data=new ArrayList<String[]>();
		
		String[] s1= {"Akash","A123"};
		data.add(s1);
		
		String[] s2= {"Bhumi","B123"};
		data.add(s2);
		
		
		String[] s3= {"Chandra","C123"};
		data.add(s3);
		
		Iterator<String[]> iData = data.iterator();
		
		return iData;
	}
	
	@Test(dataProvider = "getData" )
	public void test1(String un,String pw)
	{
		Reporter.log("Create User:"+un+" "+pw ,true);
	}
	
	
}
