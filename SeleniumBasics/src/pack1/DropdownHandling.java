package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		Thread.sleep(3000);
		
//		WebElement monthDropdown = driver.findElement(By.xpath("//select[@id='month']"));
//		monthDropdown.click();
//		
//		List<WebElement> options = driver.findElements(By.xpath("//select[@id='month']//option"));
//		
//		Thread.sleep(3000);
//		
//		for( WebElement option : options)
//		{
//			String monthName = option.getText();
//			System.out.println(monthName);
//			
//			if(monthName.equals("Sep"))
//			{
//				option.click();
//				break;
//			}
//		}
		
		
//		Dropdown handling using "select" class

		WebElement dayDrop = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select sel = new Select(dayDrop);
		
		Thread.sleep(3000);
		sel.selectByIndex(5);
		
		Thread.sleep(3000);
		sel.selectByValue("12");
		
		Thread.sleep(3000);
		sel.selectByVisibleText("18");
	}
	

}
