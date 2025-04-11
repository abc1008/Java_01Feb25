package logicalPrograms;

public class LogicalPrograms {
	
	
//	Armstrong num:  15378787
	
//	(1 * 1 * 1) + (5 *5 * 5) + (3 * 3 * 3)  = 153
	
	
//	1 % 10 = rem = 1  10 * 0 = 0
	
	
//	Armstrong num :  The sum of each digit raised to the power of number of digits equals the number itself.
	
	
	public static int getLastDigit(int n)
	{
		int lastDigit = n % 10;
		
		return lastDigit;
	}
	
	public static void isArmstrongNumber(int n)
	{
		
		int num = n;
		int sumCube = 0;
		
		
		while(num != 0) 
		{
			int lastDigit = getLastDigit(num);
			
			int cube = lastDigit * lastDigit * lastDigit; 
			
			
			
			
			sumCube = sumCube + cube; 
			num = num/10; 
			
		}
		
		System.out.println(sumCube);
		
		if(sumCube == n)
		{
			System.out.println("num is armstrong");
		}
		else
		{
			System.out.println("num is not armstrong");
		}
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		isArmstrongNumber(1634);
		
		
	}
	

}
