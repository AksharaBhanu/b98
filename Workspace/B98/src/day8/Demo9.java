package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		WebElement element = driver.findElement(By.id("input-username"));
		
		int x=element.getLocation().getX();
		System.out.println("x:"+x);
		
		int y=element.getLocation().getY();
		System.out.println("y:"+y);
		
		int h = element.getSize().getHeight();
		System.out.println("Height:"+h);
		
		int w = element.getSize().getWidth();
		System.out.println("Width:"+w);
		
		driver.quit();
	}

}
