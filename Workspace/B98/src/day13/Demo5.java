package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample4.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));//return all the matching element
		int count=allLinks.size();

		for(int i=0;i<count;i++)
		{
			WebElement link1 = allLinks.get(i);
			System.out.println(link1.getAttribute("href"));
		}
		System.out.println("----------");
		
		for(WebElement link:allLinks)
		{
			System.out.println(link.getAttribute("href"));
		}
		
	}
}
