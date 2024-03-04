package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo9 {

	public static void main(String[] args) throws Exception {
		
			
		WebDriver driver=new ChromeDriver();//no arg constructor
		driver.get("https://aksharatraining.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actions=new Actions(driver);//single arg constructor
				for(int i=1;i<=5;i++)
				{
					actions.scrollByAmount(0,500).perform();//scroll down
					Thread.sleep(1000);
				}
				
				for(int i=1;i<=5;i++)
				{
					actions.scrollByAmount(0,-500).perform();//scroll up
					Thread.sleep(1000);
				}
		driver.quit();
	}

}
