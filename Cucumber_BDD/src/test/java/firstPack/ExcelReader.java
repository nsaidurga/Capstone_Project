package firstPack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
 
public class ExcelReader {
 
    public static List<List<String>> getSheetData(String filePath, String sheetName) {
        List<List<String>> sheetData=new ArrayList<>();
        
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(fis)) {
 
            Sheet sheet = workbook.getSheet(sheetName);
            
            for(Row row:sheet) {
            	List<String> rowData=new ArrayList<>();
            	for(Cell cell:row) {
            		rowData.add(cell.toString());
            	}
            	sheetData.add(rowData);
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sheetData;
    }
    
    
    /*
     public static String getCellValue(String filePath, String sheetName, int row, int col) {
        String cellValue = "";
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(fis)) {
 
            Sheet sheet = workbook.getSheet(sheetName);
            
            Row sheetRow = sheet.getRow(row);
            Cell cell = sheetRow.getCell(col);
 
            cellValue = cell.toString();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cellValue;
    }
     */
}