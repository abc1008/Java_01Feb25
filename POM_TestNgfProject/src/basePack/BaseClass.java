package basePack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://devsite.testometer.co.in/login");
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}
	
	

}
