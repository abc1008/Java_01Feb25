package testScripts;

import java.io.IOException;

import basePack.BaseClass;
import basePack.TestometerApp;
import page_classes.ChangePasswordPage;
import page_classes.DashBoardPage;
import page_classes.HeaderPage;
import utility.ExtentReportHelper;

public class ChangePasswordTestScript extends BaseClass
{

	public boolean performChangePassword() throws IOException
	{
		boolean testResult = false;

		try
		{
			if (TestometerApp.dashBoardPage().clickNewVersion() == true)
			{
				if (TestometerApp.headerPage().selectChangePassword() == true)
				{
					if (TestometerApp.changePasswordPage().changePassword() == true)
					{
						ExtentReportHelper.logPass("Successfully changed password.");
						testResult = true;
					}
				} 
				else
				{
					ExtentReportHelper.logFail("Failed to select Change Password option.");
				}
			} 
			else
			{
				ExtentReportHelper.logFail("Failed to click on New Version");
			}
		} catch (Exception ex)
		{
			ExtentReportHelper.logFail("Exception in method : clickNewVersion " + ex.getMessage());
		}

		return testResult;

	}

}
