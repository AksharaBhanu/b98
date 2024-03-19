package day20;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo2 {

	public static void main(String[] args) throws MalformedURLException {
		URL whichSystem=new URL("https://oauth-javagalbhanu-1711c:f217c313-38e1-43ce-9e03-a1a7094d1519@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		ChromeOptions whichBrowser=new ChromeOptions();
		WebDriver driver=new RemoteWebDriver(whichSystem, whichBrowser);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
