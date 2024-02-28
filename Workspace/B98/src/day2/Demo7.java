package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://www.fb.com");
		
		driver.close();
	}
}
