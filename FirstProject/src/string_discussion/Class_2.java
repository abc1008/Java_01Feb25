package string_discussion;

public class Class_2
{
	
	public static void main(String[] args)
	{

		String s1 = "Hello";  
		System.out.println(s1 + " hashCode : "+s1.hashCode()); 
		
		
		String s3 = s1.concat(" World");   // same as + operator
		System.out.println(s3 + " hashCode : "+s3.hashCode()); 
		
		
		s1 = "abc";  // new object 
		System.out.println(s1 + " hashCode : "+s1.hashCode()); 
		

		
		
	}
	

}
