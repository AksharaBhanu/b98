package day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo6 {

	public static void main(String[] args) throws Exception {


		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book2.xlsx"));
		
		int rc = wb.getSheet("Sheet1").getLastRowNum();//index of the last row where data present
		System.out.println(rc);
		
		wb.close();
	}

}
