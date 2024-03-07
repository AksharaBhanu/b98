package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println(driver);
		String w = driver.getWindowHandle();
		System.out.println(w);
		driver.quit();
	
	}

}
