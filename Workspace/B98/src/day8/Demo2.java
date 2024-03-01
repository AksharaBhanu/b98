package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample8.html");
		Thread.sleep(1000);
		driver.findElement(By.id("A6")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("A6")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("A7")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("A8")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
