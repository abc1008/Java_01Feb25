package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_1
{
	final static int num = 20;

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
	}

	@Test(priority = num)
	public void m1()
	{
		System.out.println("m1");
	}
	
	
	@Test(priority = 0)
	public void m2()
	{
		System.out.println("m2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	

	@Test(priority = -2)
	public void m3()
	{
		System.out.println("m3");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest");
	}
	
	
}
