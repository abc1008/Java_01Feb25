package pack1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Locators
{
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
//		findElement - locating single web element on webpage
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("ag89111@gmail.com");
		
		// screenshot
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File screenShot = screen.getScreenshotAs(OutputType.FILE);
		File file = new File("D:\\TRAININGS\\Selenium_JAVA_01FEB25_WEEKDAY_MORNING\\Screenshots\\testImage.png");
		Files.copy(screenShot, file);
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Login@123");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.findElement(By.partialLinkText("Log")).click();
		
		
		

		
	}

}
