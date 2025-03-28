package testScripts;

import page_classes.LoginPage;
import testSuites.LoginTestSuite;

public class LoginTestScripts extends LoginTestSuite
{
	public void performLogin() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);  // 
		loginPage.login();
				
	}
	
	
	

}
