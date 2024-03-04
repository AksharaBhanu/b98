package day9;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
//MTC is failed, what u will do-? submit defect report--> 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		File f = driver.findElement(By.xpath("//img")).getScreenshotAs(OutputType.FILE);
		String imgLocation = f.getAbsolutePath();
		System.out.println(imgLocation);
		Thread.sleep(1000);
		driver.quit();
	}

}
