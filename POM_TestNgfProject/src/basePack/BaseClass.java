package basePack;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import page_classes.HeaderPage;
import testScripts.LoginTestScripts;
import utility.ExtentReportHelper;

public class BaseClass
{
	public static WebDriver driver;
	public static String dateTimeStamp;
	
	
	@BeforeSuite
	public void launchBrowser()
	{
		
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("ddMMyyyy_HH_mm_ss");
		dateTimeStamp = time.format(dateTimeFormat);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://devsite.testometer.co.in/login");
		ExtentReportHelper extentReportHelper = new ExtentReportHelper(driver);
	}
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException
	{
		
		
//		LoginTestScripts loginTestScripts = new  LoginTestScripts();
//		loginTestScripts.performLogin();
		
	}
	
	
	@AfterMethod
	public void logout() throws IOException
	{
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.selectLogout();
	}
	
	
	@AfterSuite
	public void closeBrowser()
	{
		ExtentReportHelper.endTest();
		driver.quit();
	}
	
	

}
