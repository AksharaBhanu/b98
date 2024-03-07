package day12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
//set no duplicate no index
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample11.html");
		String w = driver.getWindowHandle();
		System.out.println(w);
		Thread.sleep(1000);
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println(allWHS.size());
		
		for(String v:allWHS)
		{
			System.out.println(v);
		}
		
		driver.quit();
	
	}

}
