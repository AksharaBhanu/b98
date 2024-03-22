package day22;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book3.xlsx"));
		int rc= wb.getSheet("Sheet3").getLastRowNum();
		
		for(int i=0;i<=rc;i++)
		{
			try {
					int cc = wb.getSheet("Sheet3").getRow(i).getLastCellNum();
					for(int j=0;j<cc;j++)
					{
						try {
							String v = wb.getSheet("Sheet3").getRow(i).getCell(j).getStringCellValue();
							System.out.print(v+" ");
						}
						catch (NullPointerException e) {
							System.out.print("-- ");
						}
					}
			}
			catch (NullPointerException e) 
			{
				System.out.print("-- -- -- --");
			}
			
			System.out.println();
		}
		
		wb.close();

	}

}
