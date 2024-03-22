package day22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo5 {

	public static void main(String[] args) throws Exception {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book5.xlsx"));
		wb.getSheet("sheet1").getRow(0).getCell(0).setCellValue("Akshara");//both row & cell already present
		wb.getSheet("sheet1").getRow(0).createCell(2).setCellValue("Akshara");//row already present but cell not present
		wb.getSheet("sheet1").createRow(2).createCell(0).setCellValue("Akshara");//both row & cell NOT present
		wb.write(new FileOutputStream("./data/Book6.xlsx"));
		wb.close();
	}

}
