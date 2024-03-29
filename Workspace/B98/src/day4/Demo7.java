package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	//Hw verify the home page using URL
//write login test case--> Manual test case for testing login feature	
//write a login script --> Automation script for testing login feature
	public static void main(String[] args) throws InterruptedException {
//		1. open the browser
		WebDriver driver=new ChromeDriver();
//		2. enter the url
		driver.get("https://pos.aksharatraining.in/pos/public/");
//		3. enter un(admin)
		driver.findElement(By.name("username")).sendKeys("admin");
//		4. enter pw
		driver.findElement(By.name("password")).sendKeys("pointofsale7");
//		5. click login
		driver.findElement(By.name("login-button")).click();
//		6.verify that home page is displayed
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
