package basePack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import page_classes.HeaderPage;
import testScripts.LoginTestScripts;

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
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		LoginTestScripts loginTestScripts = new  LoginTestScripts();
		loginTestScripts.performLogin();
		
	}
	
	
	@AfterMethod
	public void logout()
	{
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.selectLogout();
	}
	
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}
	
	

}
