package day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class B
{
	@FindBy(name="username")
	private WebElement unTB;
	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
}

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/login");
		
		
		B b1=new B();
		PageFactory.initElements(driver, b1);
		
		b1.setUserName("bhanu");
		
		

	}

}
