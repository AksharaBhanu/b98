package day9;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	//scroll to bottom of the page
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com");
		driver.manage().window().maximize();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		Object v = j.executeScript("return document.body.scrollHeight");
		System.out.println(v);
		
		j.executeScript("window.scrollBy(0,document.body.scrollHeight)");//scroll down
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//scroll down
		Thread.sleep(2000);
		driver.quit();
	}

}
