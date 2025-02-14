package test_pack1;

public class ConstructorDiscussion
{
	int a;
	static int b;
	

//	SYNTAX: 
	
//	public ClassName()
//	{
		// body
//	}
	
	public ConstructorDiscussion()
	{
		System.out.println("0  arg Constructor of ConstructorDiscussion class");
	}
	
	public ConstructorDiscussion(int num)
	{
		this(10,20); // refers to current class constructor 
//		this(); // refers to current class constructor
		System.out.println("1 arg Constructor of ConstructorDiscussion class : " + num);
	
	}
	
	public ConstructorDiscussion(String s1)
	{
		System.out.println("1 arg String Constructor of ConstructorDiscussion class : " + s1);
	}
	
	public ConstructorDiscussion(int num, int num2)
	{
		System.out.println("2 arg (int int) : " + num + " "+ num2);
	}
	
	public ConstructorDiscussion(int num, String num2)
	{
		System.out.println("2 arg Constructor of ConstructorDiscussion class : " + num);
	}
	
	public ConstructorDiscussion(String num2, int num)
	{
		System.out.println("2 arg Constructor of ConstructorDiscussion class : " + num);
	}
	
	public static void main(String[] args)
	{
		
//		Classname var = new Classname();
		
		ConstructorDiscussion var1 = new ConstructorDiscussion(5);

		
		
	}
	
	
	
	
	
	
	
}
