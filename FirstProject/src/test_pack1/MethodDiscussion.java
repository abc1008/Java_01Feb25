package test_pack1;

public class MethodDiscussion
{
	
//	STATIC METHOD - SYTAX
	
//	public static void methodName()
//	{
//		// Body of Method
//	}
	
	public static void method1()   // represnet logic
	{
		System.out.println("Static method - method1 - MethodDiscussion");
		System.out.println("Static method - method1 - MethodDiscussion");
		System.out.println("Static method - method1 - MethodDiscussion");
		
//		MethodDiscussion ref2 = new MethodDiscussion();
//		ref2.method2();
		
		
	}
	
//	NON-STATIC METHOD - SYNTAX
	
//	public void methodName()
//	{
//		// Body of Method
//	}
	
	
	public void method2()
	{
		System.out.println("Non-Static method - method2 - MethodDiscussion");
		System.out.println("Non-Static method - method2 - MethodDiscussion");
		System.out.println("Non-Static method - method2 - MethodDiscussion");
		
		
		method1();
	}
	
	
	public static void main(String[] args)
	{
		
		
//		 METHOD CALLING :
		
//		  1. STATIC :
		
//		SYNTAX:  methodName();
		
		method1(); 
		
		
//		2. NON-STATIC 
		
//		Create Object and with the help of ref variable of object, we can call.
		
		MethodDiscussion ref1 = new MethodDiscussion(); // memory allocation
		ref1.method2();
		
		
		MethodDiscussion ref2 = new MethodDiscussion();
		
		
	}
	

}
