package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestClass_3
{
	public static void main(String[] args) throws FileNotFoundException, InterruptedException 
	{
		int a  = 100;
		int b = 200;
		
		if(a > b)
		{
			throw new NullPointerException("a is greater than b");
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("a is less than b");
		}
		
	}

}
