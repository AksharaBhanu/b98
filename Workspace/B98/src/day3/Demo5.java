package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B98_11AM_Selenium/page/sample1.html");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();

	}

}
