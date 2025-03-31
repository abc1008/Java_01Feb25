package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage
{
	
	// private variables
	private final String buttonProfileIconByXpath = "//button[@id='page-header-user-dropdown']";
	private final String optionChangePasswordByXpath = "//a[@class='dropdown-item changePassword']//span[text()='Change Password']";
	private final String optionLogoutByXpath = "//span[text()='Logout']";
	
	
	@FindBy(xpath = buttonProfileIconByXpath) // to locate the webelements from UI
	private WebElement buttonProfileIcon;
	
	@FindBy(xpath = optionChangePasswordByXpath) 
	private WebElement optionChangePassword;
	
	@FindBy(xpath = optionLogoutByXpath) 
	private WebElement optionLogout;
	
	// constructor
	public HeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);  // initialize all non-static variables
	}
	
	private void clickProfileIcon()  // helper method
	{
		buttonProfileIcon.click();
	}
	
	// public methods
	public void selectChangePassword()
	{
		clickProfileIcon();
		optionChangePassword.click();
	
	}
	
	
	public void selectLogout()
	{
		clickProfileIcon();
		optionLogout.click();
	}
	

	
	

}
