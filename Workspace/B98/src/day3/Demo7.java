package day3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/page/sample2.html");
		Thread.sleep(1000);
		
		WebElement un = driver.switchTo().activeElement();
		un.sendKeys("admin");
		Thread.sleep(1000);
		
		un.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		un.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		un.sendKeys(Keys.TAB);
		
		
		WebElement pw=driver.switchTo().activeElement();
		pw.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		pw.sendKeys(Keys.ENTER);
		
	}

}
