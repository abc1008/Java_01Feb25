package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.JSMethods;

public class WaitsDemo3
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // implicit wait
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html#google_vignette");
		
		driver.findElement(By.xpath("//button[@id='btn1']")).click();	

		WebElement text1 = driver.findElement(By.xpath("//div[@itemprop='articleBody']//input[@id='txt1']"));
		
//		// explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(text1));
		
		
		// Fluent wait
		
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofMillis(300))
			.ignoring(NullPointerException.class);
		
	wait.until(ExpectedConditions.visibilityOf(text1));
	
		text1.sendKeys("ABCD");
		
		driver.findElement(By.xpath("//button[@id='btn2']")).click();	
	
		
		
		
	}

}
