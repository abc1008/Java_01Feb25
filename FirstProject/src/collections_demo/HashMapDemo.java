package collections_demo;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo
{

	public static void main(String[] args)
	{

//		HashMap<Key_DataType, Value_DataType> mapName = new HashMap<Key_DataType, Value_DataType>();
		HashMap<Integer, String> map1 = new HashMap<>();
		

//		insert
		map1.put(100, "ABC");
		map1.put(101, "PQR");
		map1.put(102, "QWE");
		map1.put(103, "TUV");
		map1.put(104, "QWE");
		map1.put(102, "YUI");
		map1.put(108, "YUI");
		map1.put(2, "YUI");
		map1.put(5, "YUI");
		map1.put(5, null);
		map1.put(102, "YUI");
		map1.put(102, "YUI");
		map1.put(null, "YUI");
		map1.put(null, "yuop");

		System.out.println(map1);

//		Data Fetch/get

		String value = map1.get(100);
		System.out.println("value : " + value);

//		 remove

		String removedValue = map1.remove(102);
		System.out.println("removedValue : " + removedValue);
		System.out.println(map1);

//			keyset

		Set<Integer> allKeys = map1.keySet();

		System.out.println(allKeys);

		System.out.println();

		
		
//		iterate over map
		for (Integer key : allKeys)
		{
			System.out.println(map1.get(key));
//				System.out.println(key);
		}

		
		
		
		
		
//			containsKey and containsValue

		boolean containsKey = map1.containsKey(200);
		System.out.println(containsKey);

		boolean containsValue = map1.containsValue("ABC");
		System.out.println(containsValue);

		map1.put(5, "XYZ");
		System.out.println(map1);

//			Size

		map1.size();

	}

}
