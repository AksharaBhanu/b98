package day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

class A
{
	@FindBy(name="username")
	private WebElement unTB;
	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/login");
		A a1=new A();
		a1.setUserName("bhanu");

	}

}
