package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
//xpath--> path of the element in html tree
//.--> root element
	
	public static void goBack(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/page/sample4.html");
		driver.findElement(By.xpath("/html[1]/body[1]/a[1]")).click();//FB
		goBack(driver);
		driver.findElement(By.xpath("/html/body/a[1]")).click();//FB
		goBack(driver);
		driver.findElement(By.xpath("/html/body/a[2]")).click();//google
		goBack(driver);
		try 
		{
			driver.findElement(By.xpath("/html/body/a[0]")).click();//NSEE
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		goBack(driver);
		driver.quit();
	}
}
