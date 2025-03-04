package collections_demo;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ArrayListDiscussio
{

	public static void main(String[] args)
	{
		
//													 OPTIONAL
//		ArrayList<DataType> listName = new ArrayList<DataType>();
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
//		1. insert
		
		list1.add(100);
		list1.add(400);
		list1.add(200);
		list1.add(300);
		list1.add(200);
		list1.add(500);
		list1.add(600);
		list1.add(700);
		
		
		
		
		System.out.println(list1);
		
//		2. Search - Get/fecth
		
		Integer num = list1.get(0);
		
		System.out.println();
		
		
//		3 remove
		
		list1.remove(3);
		System.out.println(list1);
		
//		4. update the value - set
		
		System.out.println();
		
		list1.set(4, 1000);
		System.out.println(list1);
		
		
//		size
		
		int size = list1.size();
		
		System.out.println(size);
		
		System.out.println();
		
		// iterate over list
		for( Integer n : list1)
		{
			System.out.println(n);
		}
		
		
		
	}
	
	
	
	
}
