package day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		Dimension cs = driver.manage().window().getSize();
		System.out.println(cs);
		Thread.sleep(2000);
		
		Dimension d=new Dimension(600,700);
		driver.manage().window().setSize(d);//resize the browser
		Thread.sleep(2000);
		
		Point cp = driver.manage().window().getPosition();
		System.out.println(cp);
		
		Thread.sleep(2000);
		Point np=new Point(600,100);
		driver.manage().window().setPosition(np);//move the browser
		Thread.sleep(2000);
		driver.quit();
	}

}
