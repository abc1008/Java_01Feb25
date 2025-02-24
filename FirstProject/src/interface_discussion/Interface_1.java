package interface_discussion;

public interface Interface_1
{

	int num1 = 1000;  // public, static, final
	
	
	void m1(); // by default public abstract

	void m2();

	void m3();
	
	
	void m8();


	public static void m4()
	{
		System.out.println("m4 static in Interface_1");
	}

	public static void main(String[] args)
	{

		m4();

	}

}
