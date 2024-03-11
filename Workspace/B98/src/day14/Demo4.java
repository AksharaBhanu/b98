package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		Thread.sleep(1000);
		String xp="//span[contains(text(),'java') or contains(text(),'Java')]";
		
		List<WebElement> allAutoSuggestions = driver.findElements(By.xpath(xp));
		int count = allAutoSuggestions.size();
		System.out.println(count);//count the number of Auto Suggestions
		
		for(WebElement element:allAutoSuggestions)
		{
			System.out.println(element.getText());//print all Auto Suggestions
		}
		
		//select 1st Auto Suggestion
//		allAutoSuggestions.get(0).click();
		
		//select 5th Auto Suggestion
//		allAutoSuggestions.get(4).click();
		
		//select last Auto Suggestion
		allAutoSuggestions.get(count-1).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
