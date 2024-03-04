package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo10 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();//no arg constructor
		driver.get("https://aksharatraining.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement e = driver.findElement(By.xpath("//h2[text()='Join the revolution!']"));
		Actions actions=new Actions(driver);//single arg constructor
		actions.scrollToElement(e).perform();	
		
		Thread.sleep(4000);
		driver.quit();
	}

}
