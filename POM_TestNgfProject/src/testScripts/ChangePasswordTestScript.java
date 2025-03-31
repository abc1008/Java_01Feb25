package testScripts;

import basePack.BaseClass;
import page_classes.ChangePasswordPage;
import page_classes.DashBoardPage;
import page_classes.HeaderPage;

public class ChangePasswordTestScript extends BaseClass
{
	
	public void performChangePassword()
	{
		
		DashBoardPage dashBoardPage = new DashBoardPage(driver);
		dashBoardPage.clickNewVersion();
		
		
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.selectChangePassword();
		
		
		ChangePasswordPage changePasswordPage = new  ChangePasswordPage(driver);
		changePasswordPage.changePassword();
		
	}
	
	
	

}
