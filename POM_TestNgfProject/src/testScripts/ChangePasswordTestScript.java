package testScripts;

import basePack.BaseClass;
import page_classes.ChangePasswordPage;
import page_classes.DashBoardPage;
import page_classes.HeaderPage;
import utility.TestometerApp;

public class ChangePasswordTestScript extends BaseClass
{

	public boolean performChangePassword()
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
						System.out.println("Successfully changed password.");
						testResult = true;
					}
				} 
				else
				{
					System.out.println("Failed to select Change Password option.");
				}
			} 
			else
			{
				System.out.println("Failed to click on New Version");
			}
		} catch (Exception ex)
		{
			System.out.println("Exception in method : clickNewVersion " + ex.getMessage());
			ex.printStackTrace();
		}

		return testResult;

	}

}
