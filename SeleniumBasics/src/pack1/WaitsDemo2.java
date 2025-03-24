package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.JSMethods;

public class WaitsDemo2
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // implicit wait
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));	
		JSMethods.scrollTo(driver, button);
		button.click();
		
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		System.out.println("Alert Handelled");
	
		
		
		
	}

}
