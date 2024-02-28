package day2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("http://www.fb.com");
		Thread.sleep(1000);
		driver.navigate().to("http://www.google.com");
		Thread.sleep(1000);
		URL url=new URL("http://www.gmail.com");
		driver.navigate().to(url);
		driver.quit();
		
	}

}
