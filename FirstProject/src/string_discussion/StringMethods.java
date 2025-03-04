package string_discussion;

public class StringMethods
{

	public static void main(String[] args)
	{
		String s1 = "Testometer";

//		1. length

		int totalChars = s1.length();
		System.out.println(totalChars);

//		2. concat();  -- to connect multiple strings

		System.out.println(s1.concat(" Class"));

//		3. charAt();   -- return the character at given index

		char charAt4 = s1.charAt(5);
		System.out.println(charAt4);

//		4. equals()  -- comparison of 2  Strings, method is Case Sensitive
		
		boolean result = s1.equals("Testometer");
		System.out.println(result);
		
//		5. equalsIgnoreCase(); -- comparison of 2  Strings, method is not Case Sensitive
		
		boolean result2 = s1.equalsIgnoreCase("testOmeTer");
		System.out.println("result2 : " + result2);

//		6. subString(); -- to create another string from given string using index
		
		String subString = s1.substring(5);  // begin index
		System.out.println(subString);
		
		String subString2  = s1.substring(2, 8); // begin index and end index
		System.out.println(subString2);
		
//		Testometer   o -->  z
		
//		7. replace  -- to replace the character in the given String
		
		System.out.println(s1.replace('e', 'Z'));
		
//		8. toUpperCase and toLowerCase 
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
//		9. trim();  --  to remove all leading and trailing spaces from given String
		
		String s2 = "Testometer";
		System.out.println(s2);
		
		System.out.println(s2.trim());
		
		System.out.println(s2.replaceAll(" ", ""));
		
		
//		compareTo
		
		int ans = s2.compareTo("Testometer");
		System.out.println(ans);
		
		
//		10. indexOf  
		
//		-- returns the index of given character
//		- if char is duplicated, then it returns the first index
		
		System.out.println(s2.indexOf('e'));
		System.out.println(s2.lastIndexOf('e'));  // get the last index of given char

		
//		11. contains - 
		
//		Returns true if and only if this string contains the specifiedsequence of 
//		char values. 
//		Its case sensitive
		
		boolean result4 = s2.toLowerCase().contains("meter");
		System.out.println(result4);
		
//		12. toCharArray - to convert given String into char array
		
		char[] charArray = s2.toCharArray();
		
		for(char ch : charArray)
		{
			System.out.println(ch);
		}
		
//		Testometer
		
//		split -  
		
//		to split the given String into multiple Strings based on any character
//		 in the given String
		
		System.out.println();
		
		String[] arr = s2.split("e");
		
		for(String s : arr)
		{
			System.out.println(s);
		}
		
		StringBuilder s33 = new StringBuilder("abc");
		
		System.out.println(s33);
		
		s33.append(" pqr");
		System.out.println(s33);
		

		
	}

}
