package day12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample11.html");
		driver.findElement(By.id("A5")).click();
		
		Set<String> all=driver.getWindowHandles();
		
		
		for(String w:all)
		{
			driver.switchTo().window(w);
		}
	
		driver.close();
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
