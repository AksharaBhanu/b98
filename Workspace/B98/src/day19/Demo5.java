package day19;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo5 {

	@Test
	public void createUser(){
		Reporter.log(" createUser ",true);
	}
	
	@Test
	public void deleteUser(){
		Reporter.log(" deleteUser ",true);
	}
	
	@Test
	public void createCustomer(){
		Reporter.log(" createCustomer ",true);
		Assert.fail();
	}
	
	@Test
	public void deleteCustomer(){
		Reporter.log(" deleteCustomer ",true);
	}
	
	@Test
	public void createProduct(){
		Reporter.log(" createProduct ",true);
	}
	
	@Test
	public void deleteProduct(){
		Reporter.log(" deleteProduct ",true);
		Assert.fail();
	}
	
}
