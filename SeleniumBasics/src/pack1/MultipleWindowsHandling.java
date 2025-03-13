package pack1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandling
{

	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		String mainWindowId = driver.getWindowHandle(); // currently focused window
		System.out.println(mainWindowId);
		
		System.out.println();
		System.out.println("*** Getting all windows ***");
		System.out.println();
		
		
//		Set<String> allWindows = driver.getWindowHandles();
		
		
//		for(String win : allWindows)
//		{
//			System.out.println(win);
//			
//			if(!(win.equals(mainWindowId)))
//			{
//				driver.switchTo().window(win);
//				System.out.println("switched");
//				break;
//			}
//		}
		
		Set<String> allWindows = driver.getWindowHandles();
		
		System.out.println();
		System.out.println("*** wins from ArrayList ***");
		System.out.println();
		
		ArrayList<String> allwins = new  ArrayList<String>(allWindows);
		
		for(String s : allwins)
		{
			System.out.println(s);
		}
		
		
		driver.switchTo().window(allwins.get(2));
		System.out.println("switched to : "+allwins.get(2));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("abcd");
	
	
		
	
	
	}
	
	
	
	
	
}
