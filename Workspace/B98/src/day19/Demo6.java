package day19;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo6 {

	@Parameters({"city","area"})
	@Test
	public void testA(@Optional("Mysore")String c,@Optional("JPNagar")String a)
	{
		Reporter.log(c+"-"+a,true);
	}
}
