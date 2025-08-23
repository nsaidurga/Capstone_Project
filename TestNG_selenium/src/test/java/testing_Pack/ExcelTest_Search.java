package testing_Pack;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTest_Search {
	
	@DataProvider(name="excelData")
	public Object[][] excelDataProvider() throws EncryptedDocumentException, IOException {
		String excelPath = "C:\\Users\\sai durga\\OneDrive\\Desktop\\googleSheets\\loginData.xlsx";
		String sheetName = "sheet2";

		FileInputStream fis = new FileInputStream(excelPath);
		Workbook w = WorkbookFactory.create(fis);
		Sheet sheet = w.getSheet(sheetName);
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows - 1][cols];
		for (int i = 1; i < rows; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < cols; j++) {
				Cell cell = row.getCell(j);
				data[i - 1][j] = (cell == null) ? "" : cell.toString();
			}
		}
		w.close();
		fis.close();

		return data;
	}

	@Test(dataProvider = "excelData")
	public void testLogin(String username1, String password1) {
		System.out.println("username: "+username1+" | Password: "+password1);
		WebDriver d=new ChromeDriver();
		d.get("http://zero.webappsecurity.com/login.html");
		
		d.findElement(By.id("searchTerm")).click();
		d.findElement(By.id("searchTerm")).sendKeys("search");
		d.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);
		//d.findElement(By.name("submit")).click();
	}
}
