package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginPage3
{
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement goBTN;
	
	LoginPage3(WebDriver driver)
	{
		unTB = driver.findElement(By.name("username"));
		pwTB = driver.findElement(By.name("password"));
		goBTN= driver.findElement(By.name("login-button"));
		
	}
	
	public void setUserName(String un)
	{
		unTB.clear();
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickGoButton()
	{
		goBTN.click();
	}
}
public class Demo6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/login");
		LoginPage3 loginPage=new LoginPage3(driver);
		loginPage.setUserName("abcd");
		loginPage.setPassword("xyz");
		loginPage.clickGoButton();
		loginPage.setUserName("admin");
		loginPage.setPassword("pointofsale");
		loginPage.clickGoButton();
	}

}
