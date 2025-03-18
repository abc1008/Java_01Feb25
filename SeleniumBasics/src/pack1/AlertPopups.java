package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[normalize-space(text())='Alert with OK & Cancel']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
		
		
	}

}
