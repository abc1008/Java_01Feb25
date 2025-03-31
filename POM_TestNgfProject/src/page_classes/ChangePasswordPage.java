package page_classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangePasswordPage
{
	WebDriver driver;
	
	// private variables
	private final String textBoxPasswordByXpath = "//input[@name='password']";
	private final String textBoxConfirmPasswordByXpath = "//input[@name='confirm_pass']";
	private final String buttonUpdateByXpath = "//button[text()='Update']";
	private final String successMsgByXpath = "//span[text()='Success!']";
	
	@FindBy(xpath = textBoxPasswordByXpath) // to locate the webelements from UI
	private WebElement textBoxPassword;
	
	@FindBy(xpath = textBoxConfirmPasswordByXpath) 
	private WebElement textBoxConfirmPassword;

	@FindBy(xpath = buttonUpdateByXpath) 
	private WebElement buttonUpdate;
	
	@FindBy(xpath = successMsgByXpath) 
	private WebElement successMsg;
	
	
	// constructor
	public ChangePasswordPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);  // initialize all non-static variables
	}
	
	// public methods
	public void changePassword() 
	{
		textBoxPassword.sendKeys("abcd@1234");
		textBoxConfirmPassword.sendKeys("abcd@1234");
		buttonUpdate.click();
		
		if(successMsg.isDisplayed() == true)
		{
			System.out.println("Password changed successfully");
		}
		else
		{
			System.out.println("Password changed failed.");
		}
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(successMsg));
	
	}
	

	
	

}
