package logicalPrograms;

public class StarPattern {
	
	
	public static void pattern1()
	{
		
		for (int row = 1; row <= 5; row++) 
		{
			
			for (int star = 1; star <= 5; star++) 
			{
				System.out.print("*");
			} 
			
			System.out.println();
		}
		
	}
	
	
	public static void pattern2()
	{
		
		for (int row = 1; row <= 5; row++) 
		{
			
			for (int star = 1; star <= row; star++) 
			{
				System.out.print("*");
			} 
			
			System.out.println();
		}
		
	}
	
	public static void pattern3(int n)
	{
		
		for (int row = 1; row <= n; row++) 
		{
			
			for (int space = (n -row); space > 0; space--) 
			{
				System.out.print(" ");
			} 
			
			
			for (int star = 1; star <= row; star++) 
			{
				System.out.print("*");
			} 
			
			System.out.println();
		}
		
	}
	
	
	public static void pattern4(int n)
	{
		
		for (int row = 1; row <= n; row++) 
		{
			for (int space1 = (n -row); space1 > 0; space1--) 
			{
				System.out.print(" ");
			} 
			
			for (int star = 1; star <= (2*row - 1); star++) 
			{
				System.out.print("*");
			} 
			
			for (int space2 = (n -row); space2 > 0; space2--) 
			{
				System.out.print(" ");
			}
			
			System.out.println();
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
//		pattern1();
		
//		pattern2();
		
//		pattern3(5);
		
		pattern4(5);
	}
	

}
