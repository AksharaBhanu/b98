package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("callout");
		
		WebElement f = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(f);
		
		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
	}

}
