package day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/login");
//		driver.findElement(By.name("username")).sendKeys("Admin");
		
//		WebElement unTB = driver.findElement(By.name("username"));
//		unTB.sendKeys("admin");
		
		WebElement unTB;//declaration
		unTB = driver.findElement(By.name("username"));//initialization
		unTB.sendKeys("admin");//utilization

	}

}
