package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass3
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[contains(@id,'u_0_8')]")).sendKeys("ABC");
		
		Thread.sleep(3000);
		
		Actions act = new  Actions(driver);
		act.sendKeys(Keys.TAB).sendKeys("PQR").build().perform();
		
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
	}
	

}
