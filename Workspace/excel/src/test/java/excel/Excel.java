package excel;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;

public class Excel {

    public static String getCellValue(String excelFilePath, String sheetName, String rowHeader, String columnHeader) {
        try {
            Workbook workbook = WorkbookFactory.create(new FileInputStream(excelFilePath));
            Sheet sheet = workbook.getSheet(sheetName);
            int rowIndex = findRowIndex(sheet, rowHeader);
            int columnIndex = findColumnIndex(sheet, columnHeader);
           
            return sheet.getRow(rowIndex).getCell(columnIndex).toString();

        } 
        catch (Exception e) 
        {
            System.err.println("Error: " + e.getMessage());
            return null;
        }
       
    }

    private static int findRowIndex(Sheet sheet, String rowHeader) {
        for (Row row : sheet) {
            Cell cell = row.getCell(0); 
            String v=cell.getStringCellValue();
            if (cell.getStringCellValue().equals(rowHeader))
            {
                return row.getRowNum();
            }
        }
        System.err.println("Row header not found");
        return -1; 
    }

    private static int findColumnIndex(Sheet sheet, String columnHeader) {
        Row headerRow = sheet.getRow(0);
        for (Cell cell : headerRow) {
            if (cell.getStringCellValue().equals(columnHeader))
            {
                return cell.getColumnIndex();
            }
        }
        System.err.println("Column header not found");
        return -1; 
    }

    public static void main(String[] args) {
        String cellValue = getCellValue("Book1.xlsx", "Sheet1", "A2", "data");
        System.out.println("Cell value: " + cellValue);

    }
}
