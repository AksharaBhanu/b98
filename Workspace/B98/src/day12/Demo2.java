package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
//calendar popup is an example for HTML popup
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	Thread.sleep(1000);
	String msg="Date Not found";
	
	for(int i=1;i<=12;i++)
	{
		try 
		{
			driver.findElement(By.xpath("//div[text()='April 2025']/../..//p[text()='1']")).click();
			msg="Date is Selected";
			break;
		}
		catch (Exception e)
		{
			
			if(i<12)
			{
				System.out.println("Date Not present hence clicking next:"+i);
				driver.findElement(By.xpath("//span[@ aria-label='Next Month']")).click();
			}
			else
			{
				System.out.println("Reached End");
			}
			Thread.sleep(1000);
		}
	}
	
	System.out.println(msg);
	}

}
