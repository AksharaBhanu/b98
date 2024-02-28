package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void goBack(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample4.html");
		driver.findElement(By.xpath("//a")).click();
		goBack(driver);
		driver.findElement(By.xpath("//a[1]")).click();
		goBack(driver);
		driver.findElement(By.xpath("//a[2]")).click();
		goBack(driver);
		driver.quit();
	}

}
