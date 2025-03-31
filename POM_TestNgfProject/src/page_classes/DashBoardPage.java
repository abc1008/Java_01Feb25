package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage
{
	
	// private variables
	private final String buttonNewVersionByXpath = "//b[text()='New Version']";
	
	
	@FindBy(xpath = buttonNewVersionByXpath) 
	private WebElement buttonNewVersion;
	
	
	// constructor
	public DashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);  // initialize all non-static variables
	}
	
	
	// public methods
	public void clickNewVersion()
	{
		buttonNewVersion.click();
		
	}
	

	
	

}
