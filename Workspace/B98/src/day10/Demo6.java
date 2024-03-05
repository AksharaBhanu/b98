package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/Sample10.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);//using index- int
		driver.findElement(By.id("t2")).sendKeys("A");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("A");
		
		driver.switchTo().frame("f1");//using id or name --> String
		driver.findElement(By.id("t2")).sendKeys("B");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("B");
		
		WebElement frameElement = driver.findElement(By.name("n1"));
		
		driver.switchTo().frame(frameElement);//using element--> WebElement
		driver.findElement(By.id("t2")).sendKeys("C");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("C");
		
	}

}
