package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample13.html");
		Thread.sleep(1000);
		WebElement listBox = driver.findElement(By.id("A1"));
		Select select=new Select(listBox);
		Thread.sleep(1000);
		select.selectByIndex(1);
		Thread.sleep(1000);
		select.selectByValue("c");
		Thread.sleep(1000);
		select.selectByVisibleText("Delhi");
	}

}
