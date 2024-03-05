package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {
//drag and drop

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/Sample9.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement box1 = driver.findElement(By.id("drag1"));
		WebElement box2 = driver.findElement(By.id("box2"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(box1, box2).perform();
		Thread.sleep(4000);
		driver.quit();
		}

}
