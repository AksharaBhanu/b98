package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo7 {
//NSEE
//1. Thread.sleep (Demo1.java)--default timeout value NA
//2. implicitlyWait (Demo2.java)--default timeout value 0s-->polling 0.5s
//3. WebDriverWait (explicit wait)--default timeout value NA -->polling 0.5s
//4. FluentWait (parent class of WebDriverWait)--default timeout value NA -->polling 0.5s we can change
//5. custom wait	--default timeout value NA -->-->polling NA
//6. pageLoadTimeout--> driver.get (navigate())--default timeout value 5min-->polling 0.5s 
//7. scriptTimeout  -> executeScript method of JavascriptExecutor	--Default timeout value is 30S-->polling 0.5s 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		Duration pageTimeOut = driver.manage().timeouts().getPageLoadTimeout();
		System.out.println(pageTimeOut);
		//get method will enter url and waits till the page is loaded within 5min
		
		
		// write a code to verify whether page is loaded within 5s or not
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		try 
		{
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			System.out.println("Page is loaded within 5s");
		}
		catch (Exception e) {
			System.out.println("Page is not loaded within 5s");
		}
	
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.navigate().to("");
		
		System.out.println("End");
		Duration st = driver.manage().timeouts().getScriptTimeout();
		System.out.println(st);
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
	}
}
