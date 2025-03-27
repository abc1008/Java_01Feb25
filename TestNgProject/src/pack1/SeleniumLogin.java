package pack1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utility.CaptureScreen;

public class SeleniumLogin
{
	WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	
	@BeforeMethod
	public void login()
	{
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("ag89111@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Login@123");
		
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	}
	
	@AfterMethod
	public void logout() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.findElement(By.partialLinkText("Log")).click();
		
		
		WebElement logoutMsg = driver.findElement(By.xpath("//div[@id='content']//h1"));
		
		if(logoutMsg.getText().equals("Account Logout"))
		{
			System.out.println("Logout Successful");
		}
		else
		{
			CaptureScreen.printScreen(driver, "abc");
		}
	}
	
	
	@Test
	public void testCase()
	{
		System.out.println("testCase");
	}

}
