package oops_discussion;

import access_modifiers.TestClass1;

public class DefaultTest extends TestClass1
{
	
	public static void main(String[] args)
	{
		TestClass1 tc1 = new TestClass1();
		
		DefaultTest dt1 = new DefaultTest(); // ref variable of child class
		
		System.out.println(dt1.num1);
		
		
		dt1.m1();
		
//		tc1.m1();
	}
	
	
	
	

}
