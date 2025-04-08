package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.JSMethods;

public class WebTableHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		Thread.sleep(3000);
		
		
		WebElement table = driver.findElement(By.xpath("//table[@id='countries']"));
		JSMethods.scrollTo(driver, table);
		
		
		List<WebElement> totalRows = driver.findElements(By.xpath("//table[@id='countries']//tr"));
		List<WebElement> rowData = driver.findElements(By.xpath("(//table[@id='countries']//tr)[3]//td"));
		

		for(int row =2; row < totalRows.size(); row++)
		{
			for(int col =0; col<rowData.size(); col++)
			{
				if(col == 0)
				{
					WebElement ele = driver.findElement(By.xpath("(//table[@id='countries']//tr)["+row+"]//td[1]//input[@class='hasVisited']"));
					
					JSMethods.click(driver, ele);
				
				}
				else if(col == 1)
				{
					String secondColData = driver.findElement(By.xpath("((//table[@id='countries']//tr)["+row+"]//td)[2]//strong")).getText();
					System.out.println(secondColData);
				}
				else
				{
					rowData = driver.findElements(By.xpath("(//table[@id='countries']//tr)["+row+"]//td"));
					System.out.println(rowData.get(col).getText());
				}
			}
			
			Thread.sleep(1000);
		}
		

		
		
		
		
		
	}
	
	

}
