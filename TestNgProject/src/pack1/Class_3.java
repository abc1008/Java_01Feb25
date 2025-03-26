package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class_3
{
	
	@Test
	public void m4()
	{
		System.out.println("m4");
		
//		Assert.fail();  // to fail the test case
//		Assert.assertEquals(titleFromUI, "ABC");
//		Assert.assertNotEquals();
		
		String titleFromUI = "ABC";
		boolean result = titleFromUI.equalsIgnoreCase("ABC");
		
		
		
		Assert.assertFalse(result);   // fail
		
		Assert.assertTrue(result);  // pass
		
		System.out.println("After Assert");
		
	}
	
	@Test
	public void m5()
	{
		System.out.println("m5");
		
		SoftAssert sa = new SoftAssert();
//		sa.fail();
//		sa.assertEquals(false, false);
//		sa.assertNotEquals(true, true);
		
		String titleFromUI = "ABC";
		boolean result = titleFromUI.equalsIgnoreCase("ABCd");
		
		sa.assertTrue(result); // fail
		
//		sa.assertFalse(result);  // pass
		
		System.out.println("After Soft Assert");
		
		
		sa.assertAll();  // apply assertion result to test case
		
		System.out.println("After assertAll");
		
	}
	
	



}
