package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo6 {
//NSEE
//1. Thread.sleep (Demo1.java)
//2. implicitlyWait (Demo2.java)
//3. WebDriverWait (explicit wait) 
//4. FluentWait (parent class of WebDriverWait)
//5. custom wait	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		for(int i=1;i<=30;i++)
		{
			try 
			{
				driver.findElement(By.name("username")).sendKeys("Admin");
				System.out.println("username found hence exit:"+i);
				break;
			}
			catch (Exception e) 
			{
				System.out.println("not able to find username:"+i);
			}
		}
		System.out.println("End");
	}
}
