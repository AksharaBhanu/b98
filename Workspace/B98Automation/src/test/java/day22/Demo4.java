package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws Exception {
	
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/BOOK4.xlsx"));
		String un = wb.getSheet("LOGIN").getRow(1).getCell(0).toString();
		String pw = wb.getSheet("LOGIN").getRow(1).getCell(1).toString();
		wb.close();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.name("login-button")).click();
		
		
		
	}

}
