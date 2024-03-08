package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample12.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		SearchContext root = driver.findElement(By.id("shadow_host")).getShadowRoot();//selenium4
		root.findElement(By.cssSelector("#t1")).sendKeys("Bhanu");
		

	}

}
