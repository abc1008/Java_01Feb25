package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExplicitWait;

public class DashBoardPage
{
	WebDriver driver;
	
	// private variables
	private final String buttonNewVersionByXpath = "//b[text()='New Version']";
	
	
	@FindBy(xpath = buttonNewVersionByXpath) 
	private WebElement buttonNewVersion;
	
	
	// constructor
	public DashBoardPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);  // initialize all non-static variables
	}
	
	
	// public methods
	public boolean clickNewVersion()
	{
		boolean testResult = false;
		
		try
		{
			buttonNewVersion.click();
			
			boolean result = ExplicitWait.waitUntilElementInvisible(driver, buttonNewVersion);
			
			if(result == true)
			{
				System.out.println("Clicked on New Version button");
				testResult = true;
			}
			else
			{
				System.out.println("Failed to clicked on New Version button");
			}
			
		}
		catch (Exception ex) 
		{
			System.out.println("Exception in method : clickNewVersion "+ex.getMessage());
			ex.printStackTrace();
		}

		return testResult;
		
	}
	

	
	

}
