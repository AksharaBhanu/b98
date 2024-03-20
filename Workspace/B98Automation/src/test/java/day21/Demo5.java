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

public class Demo5 {

	public static void main(String[] args) throws Exception {


		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book2.xlsx"));
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				String v = wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();		
				System.out.print(v+" ");
			}
			System.out.println();
		}
		
		

		wb.close();
	}

}
