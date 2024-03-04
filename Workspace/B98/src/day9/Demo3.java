package day9;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
//take screenshot of page
//TakesScreenshot --> Functional interface	- one method
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();//Auto up-casting
		driver.get("https://pos.aksharatraining.in/pos/public/");
		TakesScreenshot t=(TakesScreenshot)driver;//explicit type casting
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File dstFile = new File("./screenshot/pos_login_page.png");		
		FileUtils.copyFile(srcFile, dstFile);
		driver.quit();
	}

}
