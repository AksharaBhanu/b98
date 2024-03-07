package day12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
//	close only the child browsers
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String parent = driver.getWindowHandle();
		
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample11.html");
		driver.findElement(By.id("A5")).click();
		
		Set<String> all=driver.getWindowHandles();
		
		all.remove(parent);
		
		for(String child:all)
		{
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			driver.close();
		}
	
		
		
		
	}

}
