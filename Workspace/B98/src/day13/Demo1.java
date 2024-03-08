package day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {
//Notification popup
//	
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);//open the browser with modified setting
		
//		WebDriver driver=new ChromeDriver();//open the browser with default setting
		driver.get("https://www.irctc.co.in/");

	}

}
