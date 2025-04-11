package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Parallel1 {
	
	@Test
	public void m1()
	{
		System.out.println("m1");
	}
	
	
	@Test
	public void m2()
	{
		System.out.println("m2");
		Assert.fail();
	}
	
	
	@Test
	public void m3()
	{
		System.out.println("m3");
	}
	
	
	@Test
	public void m4()
	{
		System.out.println("m4");
		Assert.fail();
	}
	
	@Test
	public void m5()
	{
		System.out.println("m5");
		Assert.fail();
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
		Assert.fail();
	}
	

}
