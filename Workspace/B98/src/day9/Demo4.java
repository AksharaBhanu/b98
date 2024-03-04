package day9;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//selenium will take screenshot of current visible area (it will not scroll down)
public class Demo4 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File dstFile = new File("./screenshot/akshara.png");		
		FileUtils.copyFile(srcFile, dstFile);
		driver.quit();
	}

}
