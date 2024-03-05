package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {
//double click

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/Sample9.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String before = driver.findElement(By.id("box")).getText();
		System.out.println(before);
		
		WebElement button = driver.findElement(By.xpath("//input[@value='Double Click']"));
		
		Actions actions=new Actions(driver);
		actions.doubleClick(button).perform();
		
		Thread.sleep(2000);
		String after = driver.findElement(By.id("box")).getText();
		System.out.println(after);
		
		driver.quit();
	}

}
