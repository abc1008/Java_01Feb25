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
	
	
	@Test
	public void tc1234_LoginTest() throws InterruptedException
	{
		LoginTestScripts loginTestScripts = new  LoginTestScripts();
		loginTestScripts.performLogin();
	}
	
	
	
	@Test
	public void tc1235_LoginTest() throws InterruptedException
	{
		LoginTestScripts loginTestScripts = new  LoginTestScripts();
		loginTestScripts.performLogin();
	}
	


}
