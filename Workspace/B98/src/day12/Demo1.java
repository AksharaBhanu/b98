package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
//calendar popup is an example for HTML popup
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='March 2024']/../..//p[text()='10']")).click();
	}

}
