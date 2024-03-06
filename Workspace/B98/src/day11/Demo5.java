package day11;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample11.html?");
		Thread.sleep(2000);
//		driver.findElement(By.id("A2")).sendKeys("E:/MyCV2.docx");//absolute path
//		driver.findElement(By.id("A2")).sendKeys("./mydoc/MyCV.docx");
		File f=new File("./mydoc/MyCV.docx");
		String path = f.getAbsolutePath();
		driver.findElement(By.id("A2")).sendKeys(path);
	}

}
