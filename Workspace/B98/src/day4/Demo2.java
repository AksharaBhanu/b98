package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		
		WebDriver browser=new ChromeDriver();
		browser.get("file:///E:/B98_11AM_Selenium/page/sample3.html");			
		//in the browser, find the element by tag name 'a' and click it
		browser.findElement( By.tagName("a")).click();
		
		
	}

}
