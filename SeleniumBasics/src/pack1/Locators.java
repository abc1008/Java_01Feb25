package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
//		findElement - locating single web element on webpage
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("ag89111@gmail.com");
		
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
