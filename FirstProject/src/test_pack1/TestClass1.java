package test_pack1;

public class TestClass1
{

	
	public static void main(String[] args)
	{

		System.out.println("Hello World..!!"); 
		
		TestClass1 ref1 = new TestClass1();
		
		TestClass1 ref2 = new TestClass1();
		
//		SYNTAX:
		
//		DataType variableName = value;
		
		byte var1 = 87;      // variable declaration + initializing the variable
		short var2 = 5695;
		int var3 = 45899744;
		long var4 = 77788;
		
		
		System.out.println(var1);   
		var1 = 100;      // re-initializing the variable
		System.out.println(var1);
	}

}
