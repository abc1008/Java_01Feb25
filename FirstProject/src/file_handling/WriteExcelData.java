package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData
{
	
	public static void main(String[] args) throws IOException
	{
		String filePath = "D:\\TRAININGS\\Selenium_JAVA_01FEB25_WEEKDAY_MORNING\\Excel File.xlsx";
		FileInputStream file = new FileInputStream(filePath); // file path provided to java
		
		XSSFWorkbook wb = new XSSFWorkbook(file);  // open the file
		
		
		FileOutputStream fOut = new FileOutputStream(filePath);
		
//		XSSFSheet sheet = wb.getSheet("Sheet1");  // opening the sheet
//		XSSFRow row = sheet.getRow(2);   // get the row
//		XSSFCell cell = row.getCell(1); // get the cell
//		
//		cell.setCellValue("Update2");   // write the data into cell
		
		// to create a new row
		XSSFCell newRow = wb.getSheet("Sheet1").createRow(4).createCell(1);
		 
//		XSSFCell newCell = newRow.createCell(1);
		
//		newCell.setCellValue(123);
		
		
		wb.write(fOut);
		
		wb.close();
		
		System.out.println("Write Operation Completed");
	}

}
