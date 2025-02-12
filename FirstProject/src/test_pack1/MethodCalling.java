package test_pack1;

public class MethodCalling
{
	static int var2 = 200;
	
	
	
	public void method3()
	{
		System.out.println("method3 from MethodCalling");
		
		System.out.println();
		System.out.println("********");
		System.out.println();
		
		MethodDiscussion.method1();
		
		System.out.println();
		System.out.println("********");
		System.out.println();
		
		MethodDiscussion ref4 = new MethodDiscussion();
		ref4.method2();
		
		
	}
	
	
	
	
	public static void testMethod()
	{
		
	}
	
	
	public static void main(String[] args)
	{
		
//		SYNTAX:
		
//		Static method from another class
		
//		ClassName.methodName();
		
//		MethodDiscussion.method1();
		
		System.out.println();   // new line
		
//		Non-Static method from another class:
		
//		Create Object of that class in which method is present
//		and with the help of ref variable of object, we can call.
		
		MethodDiscussion ref2 = new MethodDiscussion();
		ref2.method2();
		
		System.out.println();   // new line
		
		ref2.method1();   // not recommended
		
		
		MethodCalling ref3 = new MethodCalling();
		ref3.method3();
		
		
//		ClassName.method();
		
		
		VariableDiscussion vv = new VariableDiscussion();
		System.out.println(vv.num1);
		
		
	}

}
