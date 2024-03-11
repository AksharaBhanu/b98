package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample14.html");
		Thread.sleep(1000);
		WebElement listbox = driver.findElement(By.id("A2"));
		
		Select select=new Select(listbox);
	
		List<WebElement> selected = select.getAllSelectedOptions();
		int count = selected.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			System.out.println(selected.get(i).getText());
		}
		System.out.println("---------");
		
		WebElement firstSelected = select.getFirstSelectedOption();
		System.out.println(firstSelected.getText());
		driver.quit();
		
		
	}

}
