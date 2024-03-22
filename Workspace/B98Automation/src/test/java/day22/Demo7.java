package day22;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
//login to POS by taking data from property file
	public static void main(String[] args) throws Exception {
	
		Properties p=new Properties();
		p.load(new FileInputStream("./data/data.properties"));
		String url=p.getProperty("url");
		String un = p.getProperty("un");
		String pw = p.getProperty("pw");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.name("login-button")).click();
		
		
		
	}

}
