package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExplicitWait;

public class HeaderPage
{
	WebDriver driver;
	// private variables
	private final String buttonProfileIconByXpath = "//button[@id='page-header-user-dropdown']";
	private final String optionChangePasswordByXpath = "//a[@class='dropdown-item changePassword']//span[text()='Change Password']";
	private final String optionLogoutByXpath = "//span[text()='Logout']";
	private final String buttonUpdateByXpath = "//button[text()='Update']";
	
	@FindBy(xpath = buttonProfileIconByXpath) // to locate the webelements from UI
	private WebElement buttonProfileIcon;
	
	@FindBy(xpath = optionChangePasswordByXpath) 
	private WebElement optionChangePassword;
	
	@FindBy(xpath = optionLogoutByXpath) 
	private WebElement optionLogout;
	
	@FindBy(xpath = buttonUpdateByXpath) 
	private WebElement buttonUpdate;
	
	// constructor
	public HeaderPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);  // initialize all non-static variables
	}
	
	private void clickProfileIcon()  // helper method
	{
		buttonProfileIcon.click();
	}
	
	// public methods
	public boolean selectChangePassword()
	{
		boolean testResult = true;
		
		try
		{
			clickProfileIcon();
			optionChangePassword.click();
			
			ExplicitWait.waitUntilElementVisible(driver, buttonUpdateByXpath);
			
			
			if(buttonUpdate.isDisplayed() == true)
			{
				System.out.println("Selected on Change Password option from dropdown.");
			}
			else
			{
				System.out.println("Failed to select Change Password option from dropdown.");
				testResult = false;
			}
		}
		catch (Exception ex) 
		{
			System.out.println("Exception in method : selectChangePassword "+ex.getMessage());
			ex.printStackTrace();
		}
		

		
		return testResult;
	
	}
	
	
	public void selectLogout()
	{
		clickProfileIcon();
		optionLogout.click();
	}
	

	
	

}
