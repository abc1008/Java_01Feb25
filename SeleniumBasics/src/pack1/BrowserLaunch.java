package pack1;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserLaunch
{
	
	public Claa_1 m1()
	{
		Claa_1 ref1 = new Claa_1();
		
		return ref1;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		// browser launch
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  // maximize browser
		
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.contains("facebook"))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case fail");
		}
		
	}
	
	
	
	
	
	
	
	
	

}
