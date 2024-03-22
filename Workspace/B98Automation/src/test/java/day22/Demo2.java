package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book3.xlsx"));
		int rc= wb.getSheet("Sheet2").getLastRowNum();
		
		for(int i=0;i<=rc;i++)
		{
			int cc = wb.getSheet("Sheet2").getRow(i).getLastCellNum();
			for(int j=0;j<cc;j++)
			{
				try {
					String v = wb.getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
					System.out.print(v+" ");
				}
				catch (NullPointerException e) {
					System.out.print("-- ");
				}
			}
			
			System.out.println();
		}
		
		wb.close();

	}

}
