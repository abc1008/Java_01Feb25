package testSuites;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;
import testScripts.ChangePasswordTestScript;

public class ChangePasswordTestSuite extends BaseClass
{

	@Test
	public void tc123_ChangePasswordTest() throws IOException
	{
		Assert.assertTrue(new ChangePasswordTestScript().performChangePassword());
	}
	
	@Test
	public void tc123_ChangePasswordTest2() throws IOException
	{
		Assert.assertTrue(new ChangePasswordTestScript().performChangePassword());
	}
	
	
}
