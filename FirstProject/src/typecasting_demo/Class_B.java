package typecasting_demo;

public class Class_B extends Class_A
{

	public void m1()
	{
		System.out.println("m1 of Class_B");
	}

	public void m2(int a)
	{
		System.out.println("m2 of Class_B");
	}

	public static void main(String[] args)
	{

		Class_B childRef = new Class_B();
		childRef.m1();

		childRef.m2();
		childRef.m2(6);

//			int c = (int)b;

		Class_A convRef = (Class_A) childRef;

//		Class_A convRef = new Class_B();

		convRef.m1();
		convRef.m2();

		System.out.println();
		
//		Down Casting - 

		Class_A parentRef = new Class_A();
		parentRef.m1();

		Class_B convRef2 = (Class_B) parentRef;
		
//		Class_B convRef4 = new Class_A();
		
		
		
		
		convRef2.m1();
		
		

	}

}
