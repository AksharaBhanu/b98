package day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
//		Thread.sleep(7000);
//		System.out.println(driver.manage().window().getSize());
		
		driver.manage().window().setSize(new Dimension(800,600));
		
//		Point cp = driver.manage().window().getPosition();
//		System.out.println(cp);
//		
		driver.manage().window().setPosition(new Point(1200,100));
		
		
		
	}

}
