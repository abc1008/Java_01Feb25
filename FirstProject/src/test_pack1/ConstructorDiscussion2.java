package test_pack1;

public class ConstructorDiscussion2
{
	int a;
	static int b;
	int c = 800;
	
	public ConstructorDiscussion2(int a)
	{
		
		System.out.println("0  arg Constructor of ConstructorDiscussion2 class");
		this.a = a;
		
		b = a;   // not recommended
		c = 800;  // we are increasing code complexity
	} 
	
	
	public static void main(String[] args)
	{
		ConstructorDiscussion2 var1 = new ConstructorDiscussion2(10);
		System.out.println(var1.a);   // 10
		
		ConstructorDiscussion2 var2 = new ConstructorDiscussion2(20);
		System.out.println(var2.a);  // 20
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
