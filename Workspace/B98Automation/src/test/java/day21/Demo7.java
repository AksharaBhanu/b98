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

public class Demo7 {

	public static void main(String[] args) throws Exception {


		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book2.xlsx"));
		
		int cc = wb.getSheet("Sheet1").getRow(0).getLastCellNum();//return sl no of the last cell where data is present
		
		System.out.println(cc);
		
		wb.close();
	}

}
