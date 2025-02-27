package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestClass_2
{

	public static void main(String[] args) throws FileNotFoundException, InterruptedException 
	{
		
		FileInputStream file = new FileInputStream("D:\\TRAININGS\\Selenium_JAVA_01FEB25_WEEKDAY_MORNING\\Excel File2.xlsx");	
		
		System.out.println("Start");
		
		Thread.sleep(10000);      // 1 seconds = 1000 milliseconds - stop the program execution for specified time
		
		
		
		System.out.println("After file read.");
		
	}

}
