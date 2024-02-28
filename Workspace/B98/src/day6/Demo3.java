package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("pointofsale");
		driver.findElement(By.xpath("//button[text()='Go']")).click();
		Thread.sleep(2000);
		
		String expectedTitle="Powered by OSPOS";
		System.out.println("Expected Title:"+expectedTitle);
		
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title:"+actualTitle);
		
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("Pass: Home page is displayed");
		}
		else
		{
			System.out.println("Failed: Home page is NOT displayed");
		}
		
		driver.quit();

	}

}
