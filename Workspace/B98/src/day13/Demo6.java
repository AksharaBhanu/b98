package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample4.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//if locator is not matching
		List<WebElement> allLinks = driver.findElements(By.tagName("X"));//returns empty list--size 0
		int count=allLinks.size();
		System.out.println(count);
	
		WebElement firstLink = driver.findElement(By.tagName("X"));//NSEE
		
		driver.quit();
		
	}
}
