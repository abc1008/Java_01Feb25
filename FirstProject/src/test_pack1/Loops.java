package test_pack1;

public class Loops
{
	
	
	
	public static void main(String[] args)
	{
//		
//		System.out.println("Line 1");
//		System.out.println("Line 1");
//		System.out.println("Line 1");
//		System.out.println("Line 1");
//		System.out.println("Line 1");
		
		
//		While Loop:
		
//		SYNTAX: 
		
//		while(boolean condition)
//		{
//			 // code to repeat/iterate
//		}
	
		System.out.println();
		System.out.println("*****  WHILE **********");
		System.out.println();
		
		
		int num = 1;
		
		while(num <= 5)
		{
			System.out.println("Line 1");
			num++;   // increased by 1  	1,2,3,4,5
		}
		
		System.out.println("Out of while loop");
		
		System.out.println();
		System.out.println("*****  DO WHILE **********");
		System.out.println();
		
//		SYNTAX:
		
//		do
//		{
//			code to repeat
//		
//		}
//		while(boolean condition);
		
		int num2 = 1;
		
		do
		{
			System.out.println("Line 1");
			num2++;
		}
		while(num2 <= 5);
		
		System.out.println("Out of do while loop");
		
		
		System.out.println();
		System.out.println("*****  FOR LOOP **********");
		System.out.println();
		
		
//		SYNTAX: 
		
//						1					2,5,8					4,7
//		for(variable initialization; boolean condition;  increment/decrement)
//		{
//					3,6,9
//				code to repeat
//		
//		}
		
		for(int num3 = 1; num3 <= 5; num3++)
		{
			
			System.out.println("Line 1");
			
		}
		
		
		System.out.println("Out of for loop");
		
		
		System.out.println();
		System.out.println("*****  break keyword **********");
		System.out.println();
		
		
		
		for(int num3 = 1; num3 <= 5; num3++)
		{
			System.out.println("Line : "+num3);
			
			if(num3 == 3)
			{
				break;   // break the loop
			}
			
			System.out.println("After if block");
			
		}
		
		System.out.println("Out of for loop");
		
		
		System.out.println();
		System.out.println("*****  continue keyword **********");
		System.out.println();
		
		
		
		for(int num3 = 1; num3 <= 5; num3++)
		{
			System.out.println("Line : "+num3);
			
			if(num3 == 3)
			{
				continue;  //skip current condition/iteration/repetition and jump to next one 
			}
			
			System.out.println("After if block");
		}
		
		System.out.println("Out of for loop");
		
		
	}

}
