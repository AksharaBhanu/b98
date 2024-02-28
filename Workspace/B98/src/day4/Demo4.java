package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * <a id="a1" name="n1" class="c1" title="click here" href="http://www.google.com">My Google</a>
 */
public class Demo4 {

	public static void main(String[] args) {

	WebDriver driver=new ChromeDriver();
	driver.get("file:///E:/B98_11AM_Selenium/page/sample4.html");			
	WebElement e = driver.findElement( By.tagName("t"));
	e.click();
	}
	

}
