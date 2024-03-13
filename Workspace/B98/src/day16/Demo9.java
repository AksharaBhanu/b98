package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*How to convert this class into POM class
 * 1. declaration
 *   old code:private WebElement unTB;
 *   new code:@FindBy(name="username")private WebElement unTB;
 * 
 * 2. initialization
 * 	 old code:unTB = driver.findElement(By.name("username"));
 *   new code:PageFactory.initElements(driver, this);
 *   
 *  3. utilization:
 *     NO change
 */
class C
{
	@FindBy(name="username")
	private WebElement unTB;
	
	C(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName()
	{
		unTB.sendKeys("admin");
	}
}
public class Demo9 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/login");

		C c1=new C(driver);
		c1.setUserName();
	}

}
