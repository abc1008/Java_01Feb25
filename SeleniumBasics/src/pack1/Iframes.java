package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://ui.vision/demo/webtest/frames/");

		Thread.sleep(3000);
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		 
		driver.switchTo().frame(frame3);  // switch focus to iframe
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("ABCD");
		
		
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();  // switch focus to main webpage
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);  // switch focus to iframe
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("PQRS");
		
		
		// ************
		
		driver.switchTo().defaultContent();  // main webpage
		frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frame3);  // switch focus to iframe
		
	
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[contains(@src,'https://docs.google.com/forms/d/1')]"));
		driver.switchTo().frame(innerFrame);  // switch focus to iframe
		
		Thread.sleep(3000);
		
		WebElement radioButton = driver.findElement(By.xpath("//span[text()='I am a human']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", radioButton);
		
		radioButton.click();
		
		

		Thread.sleep(3000);
		
		driver.switchTo().parentFrame(); // switch focus to immidiate parent frame
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("XYZ");
		
		
	}

}
