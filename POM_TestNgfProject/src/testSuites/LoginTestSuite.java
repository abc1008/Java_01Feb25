package testSuites;

import java.io.IOException;

import org.testng.annotations.Test;

import basePack.BaseClass;
import testScripts.LoginTestScripts;

public class LoginTestSuite extends BaseClass
{
	
	@Test
	public void tc123_LoginTest() throws InterruptedException, IOException
	{
		LoginTestScripts loginTestScripts = new  LoginTestScripts();
		loginTestScripts.performLogin();
	}
	

}
