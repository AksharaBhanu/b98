package day12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {
//handling tabs is same as handling child windows
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample8.html");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("A2")).click();
		
		Thread.sleep(1000);

		Set<String> tabs = driver.getWindowHandles(); // window handles of all the tabs

		for(String tab:tabs)
		{
			driver.switchTo().window(tab);
			System.out.println(driver.getCurrentUrl());
		
		}

		driver.close();//closes only current tab
		
//		driver.quit();
		
		
	}

}
