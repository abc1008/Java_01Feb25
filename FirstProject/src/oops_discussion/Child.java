package oops_discussion;

import access_modifiers.TestClass1;

//import access_modifiers.TestClass1;

public class Child extends Parent 
{
	int a = 1000;
	static int b =2000;
	
	public void m1()
	{
		System.out.println(super.a); // non-static var of parent class
	}
	
	public static void main(String[] args)
	{
		System.out.println(b);
		
		Child c1 = new  Child();
		System.out.println(c1.a);
		
		c1.m1();   // method calling
		System.out.println(Parent.b);  // static variable of parent 
		
		
		
		
		
		
		TestClass1 tc1 = new TestClass1();
		
		
//		System.out.println(tc1.num1);
		
//		tc1.m1();
		
		
		
		
		
	}

}
