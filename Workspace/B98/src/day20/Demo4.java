package day20;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo4 {

	@Parameters({"browser"})
	@Test
	public void testA(@Optional("chrome") String browser) throws MalformedURLException{
		WebDriver driver;
		
		URL url=new URL("");
		//change the test name in saucelab
		
		if(browser.equals("chrome"))
		{
			ChromeOptions browserOptions=new ChromeOptions();
			driver=new RemoteWebDriver(new URL("http://localhost:4444"), browserOptions);
		}
		else
		{
			FirefoxOptions browserOptions = new FirefoxOptions();
			driver=new RemoteWebDriver(url, browserOptions);
		}
		
		
		driver.get("https://pos.aksharatraining.in/pos/public/login");
		
		for(int i=1;i<=20;i++) {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("username")).clear();
		}
		
		driver.quit();
	}
}
