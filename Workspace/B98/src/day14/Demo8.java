package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample14.html");
		Thread.sleep(1000);
		WebElement listbox = driver.findElement(By.id("A1"));
		
		Select select=new Select(listbox);
		System.out.println(select.isMultiple());
		
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("b");
		Thread.sleep(1000);
		select.selectByVisibleText("Snacks");
		Thread.sleep(1000);
//		select.deselectByIndex(0);
//		Thread.sleep(1000);
//		select.deselectByValue("b");
//		Thread.sleep(1000);
//		select.deselectByVisibleText("Snacks");
		
		select.deselectAll();//
		
	}

}
