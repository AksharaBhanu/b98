package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample14.html");
		Thread.sleep(1000);
		WebElement listbox = driver.findElement(By.id("A2"));
		
		Select select=new Select(listbox);
		WebElement all = select.getWrappedElement();
		System.out.println(all.getText());
		
		List<WebElement> allOptions = select.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		
		for(int i=count-1;i>=0;i--)
		{
			System.out.println(allOptions.get(i).getText());
			
		}
		
		driver.quit();
		
		
	}

}
