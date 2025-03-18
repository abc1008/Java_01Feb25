package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(3000);
		
//		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
//		
//		Actions act = new Actions(driver);
//		act.contextClick(rightClick).build().perform();
//		
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(doubleClick).build().perform();
		

		
		
	}
	

}
