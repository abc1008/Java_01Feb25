package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox2
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://formstone.it/components/checkbox/");
		
		Thread.sleep(3000);
		
	
		boolean isEnabled = driver.findElement(By.id("checkbox-3")).isEnabled();
		
		if(isEnabled == true)
		{
			System.out.println("Checkbox is enabled");
		}
		else
		{
			System.out.println("Checkbox is disabled");
		}
			
		
	}
	
	
	
	

}
