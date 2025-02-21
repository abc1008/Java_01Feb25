package abstract_discussion;

public class Class_2 extends Class_1
{
	public void m3()
	{
		System.out.println("Class_2 m3 Implementation");
	}

	public void m4()
	{
		System.out.println("Class_2 m4 Implementation");
	}

	public void m1()
	{
		System.out.println("Class_2 m1 Implementation");
	}

	public static void main(String[] args)
	{
		Class_2 c2 = new Class_2();
		
		c2.m1();
		c2.m2();
		c2.m3();
		c2.m4();
		
		System.out.println();
		
		Class_1 ref = new Class_2();  // parent ref + child object
		
		ref.m1();
		ref.m2();
		ref.m3();
		ref.m4();
		
		
		System.out.println(b);
		System.out.println(c2.a);
		
		
	}

}
