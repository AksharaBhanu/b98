package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo8 {
/*<input name="red" type="text" class="jfrm" maxlength="3" placeholder="255" value="100" wfd-id="id1">
 * <input name="green" type="text" class="jfrm" maxlength="3" placeholder="255" value="23" wfd-id="id2">
 * <input name="blue" type="text" class="jfrm" maxlength="3" placeholder="255" value="67" wfd-id="id3">
 * <input type="submit" name="Submit" value="Convert to Hex →" class="ui primary button" wfd-id="id4">
 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rgbtohex.net/");
		driver.manage().window().maximize();
		driver.findElement(By.name("red")).sendKeys("123");
		driver.findElement(By.name("green")).sendKeys("45");
		driver.findElement(By.name("blue")).sendKeys("67");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//button[text()='Copy']/..")).getText(); //#641743 Copy
		String[] b = a.split(" ");//|#641743|Copy|
		String c=b[0];
		System.out.println(c);
		String bc = driver.findElement(By.xpath("//button[text()='Copy']/../../div")).getCssValue("background-color");
		System.out.println(bc);
		System.out.println(Color.fromString(bc).asHex());
		driver.quit();

	}

}
