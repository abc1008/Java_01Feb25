package test_pack1;

public class ControlStatements
{
	
	int abc = 200;  // non-static variable
	
	// 0 argument constructor with blank body
	
	public static void main(String[] args)
	{
		ControlStatements cs = new ControlStatements();
		System.out.println(cs.abc);
		
//		1.	If-Else : 
		
//			SYNTAX: 
		
//		if(boolean condition)
//		{
//			// if block code
//		}
//		else
//		{
//			// else block code
//		}
		
		
		System.out.println("Added from GitHub");
		
		
		
		
		
		
		int a = 20;
		int b =20;
		
		if(a > b)
		{
			System.out.println("if block");
			System.out.println("2nd Line");
		}
		else if(a == 20)
		{
			System.out.println("a is equal to 20");
		}
		else if(b == 30)
		{
			System.out.println("b is equal to 30");
		}
	
		
		MethodCategories m = new MethodCategories();
		m.addition(100, 200);
		
//		m.addition();
		
	}
	
	
	
	
	
	

}
