package interface_discussion;

interface Interface_1
{

	void m1(); // by default public abstract

	void m2();

	void m3();

	public static void m4()
	{
		System.out.println("m4 static in Interface_1");
	}

	public static void main(String[] args)
	{

		m4();

	}

}
