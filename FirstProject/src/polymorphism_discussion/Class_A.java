package polymorphism_discussion;

public class Class_A
{
	
	int num = 300;
	
	
	final public int m1()
	{
		System.out.println("0 arg - m1");
		
		return 8;
	}
	
	
	void m1(int a)
	{
		System.out.println("1 arg (int)- m1");
	}
	
	public void m1(char a)
	{
		System.out.println("1 arg (char) m1");
	}
	
	public static void m1(int a, char b)
	{
		System.out.println(" Parent - 2 arg (int char) m1");
	}
	
	protected void m1(char b, int a)
	{
		System.out.println("Parent (2 arg char int) m1");
	}
	
	public int m1(char b,boolean bb)
	{
		System.out.println("parent m1");
		
		return 6;
	}
	
	
	public static void main(String[] args)
	{
		
		
		Class_A a1 = new Class_A();
		a1.m1('j');

		
	}

}
