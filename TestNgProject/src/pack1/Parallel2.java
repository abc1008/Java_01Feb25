package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Parallel2 {
	
	@Test
	public void m3()
	{
		System.out.println("m3 - Class2");
	}
	
	
	@Test
	public void m4()
	{
		System.out.println("m4- Class2");
		Assert.fail();
	}
	
	

}
