package test_pack1;

public class MethodCategories
{
	
	// void = nothing
	public void addition(int num1, int num2)
	{
		
		int ans = num1 + num2;
		
		System.out.println(ans);
		
	}
	
	
	/**
	 * Method to add 2 nums
	 * @param num1
	 * @param num2
	 * @return int type of data afetr adding 2 nums
	 */
	public static int addition2(int num1, int num2)
	{
		
		int ans = num1 + num2;
		
		return ans;
		
	}
	
	
	public String method2()
	{
		
		 int output = addition2(600,700);
		 
//		 System.out.println();
		 
		 return "abc";
		
	}
	
	
	public static void main(String[] args)
	{
		
		MethodCategories m = new MethodCategories();
		m.addition(60,70);
		
		
		int ansOfReturnType = m.addition2(500, 500);  // calling method
		
		
		System.out.println(ansOfReturnType);
		
		
		 String output2 = m.method2();
		 
		 System.out.println(output2);
		 
		 
		 
		 System.out.println();
		
		
	}
	
	
	
	

}
