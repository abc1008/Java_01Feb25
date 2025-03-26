package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_2
{
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}
	

	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod - Class2");
	}
	
	
	@Test
	public void m4()
	{
		System.out.println("m4");
	}
	
	@Test
	public void m5()
	{
		System.out.println("m5");
	}
	
	@Test
	public void m6()
	{
		System.out.println("m6");
		Assert.fail();
	}
	
	
	@Test
	public void m7()
	{
		System.out.println("m7");
	}
	
	
	@Test
	public void m8()
	{
		System.out.println("m8");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass - Class 2");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass - Class 2");
	}

}
