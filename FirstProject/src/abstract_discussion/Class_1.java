package abstract_discussion;

public abstract class Class_1
{
	
	int a = 100;
	static int b = 200;
	
	Class_1()
	{
		System.out.println("Class_1 Constructor");
	}
	
	
	abstract void m1();  // abstract/incomplete method
	
	public void m2()    // concrete/complete method
	{
		System.out.println("Class_1 m2 Implementation");
	}
	
	
	public abstract void m3(); 
	
	
	public abstract void m4(); 
	
	public static void m5()
	{
		System.out.println("Static m5");
	}
	
	public static void main(String[] args)
	{

		System.out.println(b);
		
		
		
		
	}

}
