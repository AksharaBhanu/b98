package day11;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample11.html?");
		Thread.sleep(2000);
		driver.findElement(By.id("A3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("PageLink_5")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("DirectLink_13")).click();
		
		//check if the file is downloaded or not
		// file is present in download folder or not
		//hint use 'file exists' 
	}

}
