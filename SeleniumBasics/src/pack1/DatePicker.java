package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		Thread.sleep(3000);
		
		int i = 0;
		
		while(i == 0)
		{
			WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			
			if(monthYear.getText().equals("September 2024"))
			{
				System.out.println("Found month");
				break;
			}
			
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='8']")).click();
		
		
		
	}
}
