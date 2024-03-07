package day12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
//by default control will be in parent browser
//	print title of all the browsers
//	close all the browsers without using quit
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample11.html");
		driver.findElement(By.id("A5")).click();
		
		Set<String> allWHS=driver.getWindowHandles();
		
	
		
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			driver.close();
			Thread.sleep(1000);
		}
		
		
		
	}

}
