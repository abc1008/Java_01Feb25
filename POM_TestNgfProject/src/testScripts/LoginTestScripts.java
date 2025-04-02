package testScripts;

import java.io.IOException;

import page_classes.LoginPage;
import testSuites.LoginTestSuite;
import utility.ExtentReportHelper;

public class LoginTestScripts extends LoginTestSuite
{
	public void performLogin() throws InterruptedException, IOException
	{
		try
		{
			LoginPage loginPage = new LoginPage(driver);  
			loginPage.login();
		}
		catch (Exception ex) 
		{
			ExtentReportHelper.logFail("Exception in method : changePassword "+ex.getMessage());
		}
				
	}
	
	

}
