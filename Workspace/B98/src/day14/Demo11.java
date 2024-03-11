package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo11 {
//print the content of the list box in sorted order
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample14.html");
		WebElement listbox = driver.findElement(By.id("A1"));
		Select select=new Select(listbox);
		List<WebElement> allOptions = select.getOptions();
		ArrayList<String> allText=new ArrayList<String>();
		
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			allText.add(text);
		}
		
		System.out.println(allText);
		
		Collections.sort(allText);
		
		System.out.println(allText);
		
		driver.quit();
		
		
	}

}
