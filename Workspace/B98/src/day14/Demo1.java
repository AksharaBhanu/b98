package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample4.html");
		List<WebElement> allElements = driver.findElements(By.tagName("a"));
		int count = allElements.size();
		System.out.println(count);
		
		WebElement element = allElements.get(0);
		String text=element.getText();
		System.out.println(text);
		driver.quit();

	}

}
