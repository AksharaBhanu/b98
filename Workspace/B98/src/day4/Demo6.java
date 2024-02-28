package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*a id="a1" name="n1" class="c1"
 * < title="click here" href="http://www.google.com">My Google</a>
 * Inbox(9)-->driver.findElement(By.partialLinkText("Inbox")).click();
 * 
 */
public class Demo6 {


	public static void goBack(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/page/sample3.html");
		driver.findElement(By.linkText("My Google")).click();
		goBack(driver);
		driver.findElement(By.partialLinkText("Go")).click();
		
	}
}
