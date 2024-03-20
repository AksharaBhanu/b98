package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {

	@Test
	public void test()
	{
		Reporter.log("Hi Bhanu3",true);
		WebDriver driver=new ChromeDriver();
		driver.quit();
	}
}
