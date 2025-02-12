package test_pack1;

public class Operators
{

	
	public static void main(String[] args)
	{
		
		int x = 60;
		System.out.println(x);
		
		
		// -	Pre-Increment
		
		int y = ++x;   // first value of x will be increased by 1 and then
//						 assigned to y
		System.out.println(y);
		
		
		
//		-	Post -Increment
		
		int a = 100;
		
		System.out.println(a);
		
		
		int b = a++;  // first value of a will be assigned to b then value 
					 // of a will be incremented by 1
		
		System.out.println(b);
		System.out.println(a);
		
		
//		-	Pre- Decrement
		
		int p = 80;
		System.out.println(p);
		
		int q = --p;   // first value of p will be decreased by 1 and then assigned to q
		System.out.println(q);
		
		
//		-	Post - Decrement
		
		int r = 30;
		System.out.println(r);
		
		int s = r--;   // first value of r will be assigned to s then value of r will be decreased by 1
		
		System.out.println(s);
		System.out.println(r);
		
		
		int aa = 100;
		int bb = 102;
		int cc = 106;
		
		boolean result = aa < bb;  // to verify if 1st num is less than 2nd num
		System.out.println(result);
		
		boolean result2 = aa <= bb;  // to verify if 1st num is less than or equal to 2nd num
		System.out.println(result2);
		
		boolean result3 = aa == bb;  // to verify if 2 nums are equal or not
		System.out.println(result3);
		
		boolean result4 = aa != bb;  // to verify if 2 nums are equal or not
		System.out.println(result4);
		
//		Logical AND
		boolean result5 = (aa > bb) && (bb > cc);
		System.out.println(result5);
		
//		Logical OR 
		boolean result6 = (aa > bb) || (bb > cc) || true;
		System.out.println(result6);
		
		
//		MODULUS Operator ( % )
//		10/2   = 5
//		10/3   = 3   remainder = 1
		
		
		int divide = 20 % 3;
		System.out.println(divide);
		
		
		
		
	}
	
	
	
	
	
	
	
}
