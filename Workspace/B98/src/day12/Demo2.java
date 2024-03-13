package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {
//calendar popup is an example for HTML popup
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	try 
	{
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
		driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']/..")).click();
		System.out.println("We saw u alia bhat");
		driver.switchTo().defaultContent();
	}
	catch (Exception e) 
	{
		e.printStackTrace();
		System.out.println("No alia bhat");
	}
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	Thread.sleep(1000);
	String msg="Date Not found";
	
	Duration d = driver.manage().timeouts().getImplicitWaitTimeout();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	for(int i=1;i<=12;i++)
	{
		try 
		{
			driver.findElement(By.xpath("//div[text()='March 2025']/../..//p[text()='1']")).click();
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
	
	driver.manage().timeouts().implicitlyWait(d);
	}

}
