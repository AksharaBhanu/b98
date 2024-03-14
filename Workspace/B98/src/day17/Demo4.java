package day17;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class D
{
	@FindBy(xpath="//a")
	private WebElement link;
	
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	
	D(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void countLinks()
	{
		int count=allLinks.size();
		System.out.println(count);
	}
	
	public void printLinks()
	{
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
	}
}

public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		D d1=new D(driver);
		d1.countLinks();
		d1.printLinks();
		driver.quit();
		
	}

}
