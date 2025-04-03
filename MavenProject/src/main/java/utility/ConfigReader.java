package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
	
	public static String readData(String propertyName) throws IOException
	{
		String path = "D:\\TRAININGS\\Selenium_JAVA_01FEB25_WEEKDAY_MORNING\\ECLIPSE_WORKSPACE\\MavenProject\\Config.properties";
		
		FileInputStream file = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(file);   // file load into memry
		String propertyValue  = prop.getProperty(propertyName);
		
//		System.out.println(propertyValue);
		
		return propertyValue;
	}

}
