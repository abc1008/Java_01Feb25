package polymorphism_discussion;

public class ClassB extends Class_A
{
	
	public int m1(char b,boolean bb)
	{
		System.out.println("child m1");
		
		return 2;
	}
	
	public void m1(char a, float b) // overloaded
	{
		System.out.println("Child - 2 arg (char, float) m1");
	}
	
	
	public void m1(char b, int a)
	{
		System.out.println("Parent (2 arg char int) m1");
	}
	
	public static void main(int [] args)
	{
		
	}

	public static void main(String[] args)
	{
		
		ClassB bb = new ClassB();   // child ref + child Object
		bb.m1('r', false);  // Overriding
		bb.m1('e', 8.55f);   // overloaded 
		
		
		System.out.println();
		System.out.println("*** Parent Class object ***");
		System.out.println();
		
		
		Class_A aa = new Class_A();    // parent ref + parent Object
		aa.m1('r', false);  // overidding
		aa.m1('y', 55);  // overloaded 
		
		
		
		System.out.println();
		System.out.println("*** Parent ref + Child object ***");
		System.out.println();
		
		
		Class_A ref = new ClassB();  // Parent ref + Child object
		ref.m1('r', false);  // overidding
		ref.m1('t', 96);     // overloaded 
		
		
//		ClassB ref2 = new Class_A();  // Child  ref + Parent object  not possible
		
		
	}
	
}
