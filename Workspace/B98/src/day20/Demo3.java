package day20;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo3 {

	public static void main(String[] args) throws MalformedURLException {
		
		FirefoxOptions browserOptions = new FirefoxOptions();
		browserOptions.setPlatformName("Linux");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("build", "B9.1");
		sauceOptions.put("name", "POSLoginTest");
		browserOptions.setCapability("sauce:options", sauceOptions);

				
		URL url=new URL("");
		WebDriver driver=new RemoteWebDriver(url, browserOptions);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
