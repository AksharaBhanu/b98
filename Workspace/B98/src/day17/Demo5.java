package day17;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class E
{
	private WebDriver driver;
	
	@FindBy(id="A1")
	private WebElement submit;
	
	
	E(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSubmit()
	{
		submit.click();
	}
	
	public void handleAlertPopup()
	{
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
}

public class Demo5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B98_11AM_Selenium/share/page/sample11.html?");
		E e1=new E(driver);
		e1.clickSubmit();
		e1.handleAlertPopup();
		driver.quit();
	}

}
