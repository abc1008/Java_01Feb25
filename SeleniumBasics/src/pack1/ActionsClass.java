package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		Thread.sleep(3000);
		
		
		WebElement mp3 = driver.findElement(By.xpath("//a[text()='MP3 Players']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(mp3).build().perform();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Show AllMP3 Players']")).click();
		
		
		
	}
	

}
