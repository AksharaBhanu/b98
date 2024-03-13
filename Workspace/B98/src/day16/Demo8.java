package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginPage4
{
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement goBTN;
	
	LoginPage4(WebDriver driver)
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
public class Demo8 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/login");
		LoginPage4 loginPage=new LoginPage4(driver);
		loginPage.setUserName("abcd");
		loginPage.setPassword("xyz");
		loginPage.clickGoButton();
		
		loginPage=new LoginPage4(driver);
		loginPage.setUserName("admin");
		loginPage.setPassword("pointofsale");
		loginPage.clickGoButton();
	}

}
