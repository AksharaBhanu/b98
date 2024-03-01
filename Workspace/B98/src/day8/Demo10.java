package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		WebElement element = driver.findElement(By.id("input-username"));
		
		int x=element.getRect().getX();
		System.out.println("x:"+x);
		
		int y=element.getRect().getY();
		System.out.println("y:"+y);
		
		int h = element.getRect().getHeight();
		System.out.println("Height:"+h);
		
		int w = element.getRect().getWidth();
		System.out.println("Width:"+w);
		
		driver.quit();
	}

}
