package collections_demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo
{
	
	public static void main(String[] args)
	{
		
//												OPTIONAL
//		HashSet<DataType> setName = new HashSet<DataType>();
		
		
		Set<Integer> set1 = new HashSet<>();
		
		
//		1. insert
		
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(400);
		set1.add(200);
		set1.add(500);
		set1.add(400);
		
		
		System.out.println(set1);
		
		System.out.println(set1);
		
		
//		contains
		
		 boolean result = set1.contains(5000);
		System.out.println(result);
		
		
		// Iterating over HashSet
		for(Integer num : set1)
		{
			System.out.println(num);
		}
		
	}

}
