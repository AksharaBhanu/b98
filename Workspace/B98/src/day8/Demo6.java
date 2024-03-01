package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample8.html");
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.id("A2"));
		
		String tag = element.getTagName();
		System.out.println(tag);
		
		String url = element.getAttribute("href");
		System.out.println(url);
		
		String text = element.getText();
		System.out.println(text);
		
		driver.quit();
		
	}

}
