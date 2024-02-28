package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	public static void m1(WebDriver c)
	{
		c.get("http://www.fb.com");
		
		String v = c.getTitle();
		System.out.println(v);
		
		String url = c.getCurrentUrl();
		System.out.println(url);
		
		c.quit();
	}
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		Demo3.m1(driver);
		
		WebDriver b=new FirefoxDriver();
		Demo3.m1(b);
		
		WebDriver c=new EdgeDriver();
		Demo3.m1(c);
		
	}

}
