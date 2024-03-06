package day11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample11.html?");
		driver.findElement(By.id("A1")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("A3")).getText());
		Thread.sleep(1000);
		driver.quit();
	}

}
