package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		SearchContext root = driver.findElement(By.xpath("//book-app[text()='BOOKS']")).getShadowRoot();
		root.findElement(By.cssSelector("#input")).sendKeys("java");
		root.findElement(By.cssSelector("#input")).sendKeys(Keys.ENTER);
	}

}
