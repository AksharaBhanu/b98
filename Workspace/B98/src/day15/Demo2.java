package day15;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Duration defaultImplicitTimeout = driver.manage().timeouts().getImplicitWaitTimeout();//S4
		System.out.println(defaultImplicitTimeout);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//selenium 3
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//selenium 4
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
