package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample4.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement firstLink = driver.findElement(By.tagName("a"));//return 1st matching element
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));//return all the matching element
		int count=allLinks.size();
		System.out.println(count);
		
		WebElement link1 = allLinks.get(0);
		System.out.println(link1.getAttribute("href"));
		
		WebElement link2 = allLinks.get(1);
		System.out.println(link2.getAttribute("href"));
		
		WebElement link3 = allLinks.get(2);//IndexOutOfBoundsException
		System.out.println(link3.getAttribute("href"));
		
		
	}
}
