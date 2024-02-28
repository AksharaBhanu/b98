package day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
		ChromeDriver c=new ChromeDriver();//open the browser
		c.get("http://www.fb.com");//enter the url
		
		String v = c.getTitle();//get the title of the page
		System.out.println(v);
		
		String url = c.getCurrentUrl();//get the url present in addressbar
		System.out.println(url);
		
		c.quit();//close the browser
		
		
		FirefoxDriver f=new FirefoxDriver();
		f.get("http://www.fb.com");
		
		String v2 = f.getTitle();//get the title of the page
		System.out.println(v2);
		
		String url2 = f.getCurrentUrl();//get the url present in addressbar
		System.out.println(url2);
		
		f.quit();
		
		
		EdgeDriver e=new EdgeDriver();
		e.get("http://www.fb.com");
		
		String v3 = e.getTitle();//get the title of the page
		System.out.println(v3);
		
		String url3 = e.getCurrentUrl();//get the url present in addressbar
		System.out.println(url3);
		
		e.quit();
	}

}
