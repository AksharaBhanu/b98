package day3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
//copy value from 1 textbox to another
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B98_11AM_Selenium/page/sample2.html");
		Thread.sleep(1000);
		
		WebElement un = driver.switchTo().activeElement();
		un.sendKeys("admin");
		Thread.sleep(1000);
		un.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		WebElement pw=driver.switchTo().activeElement();
		pw.sendKeys("admin123");
		Thread.sleep(1000);
		pw.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		
		WebElement login=driver.switchTo().activeElement();
		login.click();
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}
