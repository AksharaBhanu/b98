package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Demo1 {
//S4 -- relative locator
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample7.html");
		String xp="//td[text()='Java']";
		WebElement javaElement = driver.findElement(By.xpath(xp));
		System.out.println(javaElement.getText());
		
		String cost = driver.findElement(with(By.tagName("td")).toRightOf(javaElement)).getText();
		System.out.println(cost);
		
		String slNo=driver.findElement(with(By.tagName("td")).toLeftOf(javaElement)).getText();
		System.out.println(slNo);
		
		String header=driver.findElement(with(By.tagName("th")).above(javaElement)).getText();
		System.out.println(header);
		
		String sub=driver.findElement(with(By.tagName("td")).below(javaElement)).getText();
		System.out.println(sub);
		
		String n=driver.findElement(with(By.tagName("td")).near(javaElement)).getText();
		System.out.println(n);
		
		driver.quit();
	}

}
