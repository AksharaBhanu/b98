package day1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo4 {

	public static void main(String[] args) {
		//Open Edge Browser
		EdgeDriver e=new EdgeDriver();
		
		//enter gmail.com
		e.get("http://www.gmail.com");
		
		//close the browser
		e.quit();
		
		SafariDriver s;

		ChromiumDriver c;
		
		RemoteWebDriver r;
		
		WebDriver w;
		
		SearchContext s3;
		JavascriptExecutor j;
		
		TakesScreenshot t;
	}

}
