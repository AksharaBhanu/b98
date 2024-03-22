package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book3.xlsx"));
		int rc= wb.getSheet("Sheet1").getLastRowNum();
		
		for(int i=0;i<=rc;i++)
		{
			int cc = wb.getSheet("Sheet1").getRow(i).getLastCellNum();
			for(int j=0;j<cc;j++)
			{
				String v = wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(v+" ");
			}
			
			System.out.println();
		}
		
		wb.close();

	}

}
