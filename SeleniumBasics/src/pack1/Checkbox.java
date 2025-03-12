package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice.expandtesting.com/checkboxes");
		
		Thread.sleep(3000);
		
		WebElement checkbox1 = driver.findElement(By.id("checkbox1"));

//		perform scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", checkbox1);
		
		Thread.sleep(3000);
		checkbox1.click();
		
		Thread.sleep(3000);
		boolean isChecked = driver.findElement(By.id("checkbox2")).isSelected();
		
		
		if(isChecked == true)
		{
			System.out.println("Checkbox 2 is checked");
		}
		else
		{
			System.out.println("Checkbox 2 is unchecked");
		}
			
		
		
		
		
	}
	
	
	
	

}
