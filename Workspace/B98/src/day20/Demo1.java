package day20;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo1 {

	public static void main(String[] args) throws MalformedURLException {
		//open Chrome Browser in Local System
//		WebDriver driver=new ChromeDriver();
		URL whichSystem=new URL("http://localhost:4444");
		ChromeOptions whichBrowser=new ChromeOptions();
		WebDriver driver=new RemoteWebDriver(whichSystem, whichBrowser);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
