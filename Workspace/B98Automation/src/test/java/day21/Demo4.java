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

public class Demo4 {

	public static void main(String[] args) throws Exception {

		//open the excel file
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
		
		//goto sheet1->row1->cell1->read & print
		String v = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();		
		System.out.println(v);
		
		//close the file
		wb.close();
	}

}
