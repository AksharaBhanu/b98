package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
//print the text of all the links present in google.com
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		for(WebElement link:allLinks)
		{
			String text=link.getText();
			boolean visible = link.isDisplayed();
			System.out.println(visible+"->"+text);
		}
		
		driver.quit();
	}

}
