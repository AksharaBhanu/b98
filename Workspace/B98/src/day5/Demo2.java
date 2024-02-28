package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
//<a id="a1" name="n1" class="c1" title="click here" href="http://www.google.com">My Google</a>

	public static void goBack(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/page/sample3.html");
		driver.findElement(By.cssSelector("a[id='a1']")).click();
		goBack(driver);
		driver.findElement(By.cssSelector("a[id=\"a1\"]")).click();
		goBack(driver);
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		goBack(driver);
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		goBack(driver);
		driver.findElement(By.cssSelector("a[title='click here']")).click();
		goBack(driver);
		driver.findElement(By.cssSelector("a[href='http://www.google.com']")).click();
		goBack(driver);
		
	}
}
