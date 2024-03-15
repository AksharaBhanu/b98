package day18;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo3 
{

	@DataProvider
	public String[][] getData()
	{
		String[][] data=new String[3][2];
		data[0][0]="Akash";
		data[0][1]="A123";
		
		data[1][0]="Bhumi";
		data[1][1]="B123";
		
		data[2][0]="Chandra";
		data[2][1]="C123";
		
		return data;
	}
	
	@Test(dataProvider = "getData" )
	public void test1(String un,String pw)
	{
		
		Reporter.log("Create User:"+un+" pw:"+pw,true);
		
	}
	
	
	
	
}
