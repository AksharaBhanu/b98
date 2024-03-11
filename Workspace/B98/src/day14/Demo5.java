package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample13.html");
		Thread.sleep(1000);
		driver.findElement(By.id("A1")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='Bangalore']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("A1")).click();
		
	}

}
