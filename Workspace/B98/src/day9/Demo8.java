package day9;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws Exception {
		
			
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//h2[text()='Join the revolution!']"));
		int x=e.getLocation().getX();
		int y=e.getLocation().getY();
		y=y-200;
		System.out.println(x);
		System.out.println(y);
		JavascriptExecutor j=(JavascriptExecutor) driver;
//		j.executeScript("window.scrollBy(666,2900)");
		j.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(4000);
		driver.quit();
	}

}
