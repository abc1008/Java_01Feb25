package testSuites;

import org.testng.annotations.Test;

import basePack.BaseClass;
import testScripts.LoginTestScripts;

public class LoginTestSuite extends BaseClass
{
	
	@Test
	public void tc123_LoginTest() throws InterruptedException
	{
		LoginTestScripts loginTestScripts = new  LoginTestScripts();
		loginTestScripts.performLogin();
	}
	

}
