package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {
//hover- for drop down menu
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	String xp="(//a[text()='Free Ebooks'])[1]";
	WebElement menu = driver.findElement(By.xpath(xp));
	
	Actions actions=new Actions(driver);
	actions.moveToElement(menu).perform();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[text()='Free Machine Learning Ebooks']")).click();
	
	}

}
