package test_pack1;

public class LogicalPrograms
{
	
	
	public static void main(String[] args)
	{
		
//		Q.  Print numbers from 1 to 10
		
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
		
		
//		Q.  Print even numbers from 1 to 10
		
//		 divisible by 2   5/2 = 1   remainder = 0
		
		System.out.println();
		System.out.println("***  even numbers from 1 to 10 ***");
		System.out.println();
		
		
		for(int i = 1; i <= 20; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
			
		}
		
		
		
	}

}
