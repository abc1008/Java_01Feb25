package typecasting;

public class Class_A
{
	
	
	public static void main(String[] args)
	{
		
		byte b = 20;   //  --> int
		
		
		int c = (int)b;   // implicit
		
		System.out.println(c);
		
		
		// explicit - data loss
		
		int x = 129;   // --> byte
		
		byte y = (byte)x;
		
		System.out.println(y);
		
		
	}
	
	
	
	

}
