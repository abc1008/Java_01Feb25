package exception_handling;

public class TestClass_1
{

	public static void main(String[] args)
	{
		try
		{
			int a = 10;
			int b = 0;
			int c = a / b; // risky code
			System.out.println("After Risky Code");
		} 
		catch (Exception ex)
		{
			System.out.println("Exception caught. Catch Block Running.");
			ex.printStackTrace();
		} 
		finally
		{
			System.out.println("finally block running"); // cleanup activities
		}

		System.out.println("After Catch");
	}

}
