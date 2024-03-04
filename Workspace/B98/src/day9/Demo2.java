package day9;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
//take screenshot of element
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		File srcFile = driver.findElement(By.xpath("//img")).getScreenshotAs(OutputType.FILE);
		File dstFile = new File("./screenshot/pos_logo.png");		
		FileUtils.copyFile(srcFile, dstFile);
		driver.quit();
	}

}
