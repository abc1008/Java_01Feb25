package oops_discussion;

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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
