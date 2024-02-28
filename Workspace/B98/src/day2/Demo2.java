package day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void m1(ChromeDriver c)
	{
		c.get("http://www.fb.com");
		
		String v = c.getTitle();
		System.out.println(v);
		
		String url = c.getCurrentUrl();
		System.out.println(url);
		
		c.quit();
	}
	
	public static void m1(FirefoxDriver c)
	{
		c.get("http://www.fb.com");
		
		String v = c.getTitle();
		System.out.println(v);
		
		String url = c.getCurrentUrl();
		System.out.println(url);
		
		c.quit();
	}
	
	public static void m1(EdgeDriver c)
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
		ChromeDriver a=new ChromeDriver();
		Demo2.m1(a);
		
		FirefoxDriver b=new FirefoxDriver();
		Demo2.m1(b);
		
		EdgeDriver c=new EdgeDriver();
		Demo2.m1(c);

	}

}
