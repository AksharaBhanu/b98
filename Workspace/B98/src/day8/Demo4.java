package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("pointofsale");
//		driver.findElement(By.xpath("//button[text()='Go']")).submit();
//		driver.findElement(By.xpath("//button[text()='Go']")).click();
		driver.findElement(By.xpath("//button[text()='Go']")).sendKeys(Keys.ENTER);
	}

}
