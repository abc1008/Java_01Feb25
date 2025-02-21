package interface_discussion;

public class Class_2 extends Class_1
{

//	public void m3()
//	{
//		System.out.println("Class_2 - m3 implementation");
//	}
//	
	
	public static void main(String[] args)
	{
		Class_2 c2 = new  Class_2();
		c2.m1();
		c2.m2();
		c2.m3();
		
		System.out.println();
		
		Interface_1 iRef = new Class_2();
		iRef.m1();
		iRef.m2();
		iRef.m3();
		
		
		Interface_1.m4();
		
		
		
		
	}

}
