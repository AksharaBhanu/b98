package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		driver.findElement(By.id("input-username")).sendKeys("abcd");
		driver.findElement(By.id("input-password")).sendKeys("xyz");
		driver.findElement(By.name("login-button")).submit();
		Thread.sleep(2000);
		WebElement errMsg = driver.findElement(By.xpath("//div[@class='error']"));
		System.out.println(errMsg.isDisplayed());
		System.out.println(errMsg.getTagName());
		System.out.println(errMsg.getAttribute("class"));
		System.out.println(errMsg.getText());
		
		String c = errMsg.getCssValue("color");
		System.out.println(c);
		
		String hexaColor = Color.fromString(c).asHex();//RGB to hexa value
		System.out.println(hexaColor);
		
		String fontType = errMsg.getCssValue("font-family");
		System.out.println(fontType);
		
		String fontSize = errMsg.getCssValue("font-size");
		System.out.println(fontSize);
		
		driver.quit();
		
	}

}
