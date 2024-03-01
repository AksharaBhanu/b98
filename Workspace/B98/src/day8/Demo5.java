package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample8.html");
		Thread.sleep(1000);
		boolean v1 = driver.findElement(By.id("A1")).isDisplayed();
		System.out.println(v1);//true -- visible
		
		boolean v2 = driver.findElement(By.id("A3")).isDisplayed();
		System.out.println(v2);//false -- invisible
		
		boolean v3 = driver.findElement(By.id("A5")).isSelected();
		System.out.println(v3);//true -- selected
		
		boolean v4 = driver.findElement(By.id("A6")).isSelected();
		System.out.println(v4);//false -- de-selected
		
		boolean v5 = driver.findElement(By.id("A1")).isEnabled();
		System.out.println(v5);//true -- enabled
		
		boolean v6 = driver.findElement(By.id("A4")).isEnabled();
		System.out.println(v6);//false -- disabled
		
		driver.quit();
	}

}
