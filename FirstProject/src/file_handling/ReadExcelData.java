package file_handling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData
{
	
	public static void main(String[] args) throws IOException
	{
		
		String filePath = "D:\\TRAININGS\\Selenium_JAVA_01FEB25_WEEKDAY_MORNING\\Excel File.xlsx";
		FileInputStream file = new FileInputStream(filePath); // file path provided to java
		
		XSSFWorkbook wb = new XSSFWorkbook(file);  // open the file
		XSSFSheet sheet = wb.getSheet("Sheet7");  // opening the sheet
		XSSFRow row = sheet.getRow(1);   // get the row
		XSSFCell cell = row.getCell(0); // get the cell
		
		String data = cell.getStringCellValue(); // read the data
		
		System.out.println(data);
		
		
		 XSSFRow row2 = sheet.getRow(2);
		 XSSFCell cell2 = row2.getCell(0);
		  String numericData = cell2.getStringCellValue();
		 System.out.println(numericData);
		
		 XSSFRow row3 = sheet.getRow(0);
		 XSSFCell cell4 = row3.getCell(0);
		  String numericData3 = cell4.getStringCellValue();
		 System.out.println(numericData3);
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}
	
	
	
	
	
	
	

}
