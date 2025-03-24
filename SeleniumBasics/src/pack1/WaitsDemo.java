package pack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.ConfigReader;

public class WaitsDemo
{
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));  // implicit wait
		driver.manage().window().maximize();
		
		driver.get(ConfigReader.readData("TestSiteUrl"));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ConfigReader.readData("UserID"));
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ConfigReader.readData("Password"));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(null, null));
		
		
		// visiblity
		// invisibility
		// alert 
		// clickble 
		// textToBePresentInElement
	
		
		
		
	}

}
