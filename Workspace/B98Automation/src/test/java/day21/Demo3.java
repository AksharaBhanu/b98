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

public class Demo3 {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		//open the excel file (workbook)
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
		
		//goto sheet1
		Sheet s = wb.getSheet("Sheet1");
		
		//goto 1st row
		Row r = s.getRow(0);
		
		//goto 1st cell
		Cell c = r.getCell(0);
		
		//get the value present in cell
		String v = c.getStringCellValue();
		System.out.println(v);
		
		//close the excel file
		wb.close();
	}

}
