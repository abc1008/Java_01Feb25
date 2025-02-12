package test_pack1;

public class VariableDiscussion
{
	
//	 SYNTAX: 
//	 static DataType variableName = value;
	
	static int var1 =  100;    // static variable  variable declaration +  variable initialization
	
	
	static int var2;    // variable declaration
	static byte var3; 
	static short var4; 
	static float var7; 
	static double var6; 
	static char var8;
	static boolean var9;
	
	
//	SYNTAX:
	
//	datatype variableName = value;  -- non static variable
	
	
	int num1 = 200;
	int abc = 1000;
//	var2 = 5000;		// variable initialization
	  
	
	public void method1()   // to represent a logic
	{
		System.out.println(var1);
		
//		datatype variableName = value;
		int abc;
		
		abc = 900;
		
		System.out.println(abc);
		
		VariableDiscussion vv = new VariableDiscussion();
		System.out.println(vv.abc);
		

		
		
		char var11 = 'j';   // ascii values
		
		String s1 = "abcttttttyuuu";
		
		boolean var12 = false;
		
		System.out.println(var11);
		
		
		 float var13 = 5.698f;
		 
		 System.out.println(var13);
		 
		 double var14 = 89.6574;
		 System.out.println(var14);
		
		
	}
	
	
	public static void main(String[] args)
	{
		
//		System.out.println(abc);
		
		
		
//		SYNTAX to call static variable :  
		
//		variableName;
		
		
		
		
//		System.out.println(this);
		
		
		System.out.println(MethodCalling.var2);
		
		
		
		VariableDiscussion var5 = new VariableDiscussion();
		
		System.out.println(var5.var1);   // not recommended
		

		
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		System.out.println(var7);
		System.out.println(var6);
		
		System.out.println(var8);
		System.out.println(var9);
		
		
		System.out.println();
		System.out.println("**********");
		System.out.println();
		
		
		VariableDiscussion vv = new VariableDiscussion();
		System.out.println(vv.num1);
		
		
		vv.method1();
		
		
	}
	
	
	
	
	

}
