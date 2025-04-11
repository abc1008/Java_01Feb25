package stepDefinitions;

import java.io.IOException;

import basePack.TestometerApp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utility.ExtentReportHelper;

public class ChangePasswordStepDefinition
{
	@Given("user navigates to change password page")
	public void selectChangePasswordFromProfile() throws IOException
	{
		if (TestometerApp.dashBoardPage().clickNewVersion() == true)
		{
			if (TestometerApp.headerPage().selectChangePassword() == true)
			{
				System.out.println("Navigated to Change Password");
			}
			else
			{
				System.out.println("Failed to navigated to Change Password");
			}
		}
		else
		{
			System.out.println("Failed to click New Version");
		}
	}
	
	
	@And("enters valid credentials and hits update button")
	public void enterCredentialsAndHitUpdte() throws IOException
	{

		if (TestometerApp.changePasswordPage().enterCredsAndHitUpdate() == true)
		{
			ExtentReportHelper.logPass("Entered credentials.");
		}
		else
		{
			ExtentReportHelper.logFail("Failed to enter credentials.");
		}
		
	}

	
	public void verifyPasswordChange() throws IOException
	{
		if (TestometerApp.changePasswordPage().verifyChangePasswordSuccess() == true)
		{
			ExtentReportHelper.logPass("Password changed successfully");
		}
		else
		{
			ExtentReportHelper.logFail("Failed to change password.");
		}
	}
	
	
	

}
