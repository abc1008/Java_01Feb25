package polymorphism_discussion;

public class ClassB extends Class_A
{
	private final static int num = 600;
	
	
	public int m1(boolean b)
	{
		System.out.println("0 arg - m1");
		
		return 8;
	}
	
	
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
	
	public static void m1(int a, char b)
	{
		System.out.println(" Child - 2 arg (int char) m1");
	}


	public static void main(String[] args)
	{
	
		
		ClassB bb = new ClassB();   // child ref + child Object
		bb.m1('r', false);  // Overriding
		bb.m1('e', 8.55f);   // overloaded 
		bb.m1(8,'e');    // 
		
		
		System.out.println();
		System.out.println("*** Parent Class object ***");
		System.out.println();
		
		
		Class_A aa = new Class_A();    // parent ref + parent Object
		aa.m1('r', false);  // overidding
		aa.m1('y', 55);  // overloaded 
		aa.m1(8,'e');    
		
		
		System.out.println();
		System.out.println("*** Parent ref + Child object ***");
		System.out.println();
		
		
		Class_A ref = new ClassB();  // Parent ref + Child object
		ref.m1('r', false);  // overidding
		ref.m1('t', 96);     // overloaded 
		ref.m1(8,'e');   // method hiding
		
//		ClassB ref2 = new Class_A();  // Child  ref + Parent object  not possible
		
		
		System.out.println();
		System.out.println("*** w.r.t. variables ***");
		System.out.println();
		
		
		System.out.println(bb.num);   // ref of child
		System.out.println(aa.num);   // ref of parent
		System.out.println(ref.num);  // ref of parent
		
		
	}
	
}
