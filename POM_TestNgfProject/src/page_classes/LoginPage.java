package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	
	// private variables
	private final String textBoxEmailByXpath = "//input[@placeholder='Email']";
	private final String textBoxPasswordByXpath = "//input[@placeholder='Password']";
	private final String buttonLoginByXpath = "//button[@type='submit']";
	
	@FindBy(xpath = textBoxEmailByXpath) // to locate the webelements from UI
	private WebElement textBoxEmail;
	
	@FindBy(xpath = textBoxPasswordByXpath) 
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginByXpath) 
	private WebElement buttonLogin;
	
	
	// constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);  // initialize all non-static variables
	}
	
	
	// public methods
	public void login() throws InterruptedException
	{
		textBoxEmail.sendKeys("adityaganjkar88@gmail.com");
		textBoxPassword.sendKeys("abcd@1234");
		buttonLogin.click();
		
		Thread.sleep(3000);
	}
	

	
	

}
