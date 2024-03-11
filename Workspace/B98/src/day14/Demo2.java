package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
//Count the number of links present on give page
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count=allLinks.size();
		System.out.println(count);
		driver.quit();
		
	}

}
