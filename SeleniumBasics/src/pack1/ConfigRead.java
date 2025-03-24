package pack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead
{

	public static void main(String[] args) throws IOException
	{
		
		String path = "D:\\TRAININGS\\Selenium_JAVA_01FEB25_WEEKDAY_MORNING\\GIT_LOCAL\\Java_01Feb25\\SeleniumBasics\\Config.properties";
		
		FileInputStream file = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(file);   // file load into memry
		String data  = prop.getProperty("TestSiteUrl");
		
		System.out.println(data);
		
		
	}
	
	
	
	
	
	
	
	
	
}
