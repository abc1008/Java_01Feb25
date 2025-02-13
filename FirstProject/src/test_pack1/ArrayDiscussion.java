package test_pack1;

public class ArrayDiscussion
{
	
	public static void main(String[] args)
	{
		
		
		
//		SYNTAX: 
		
//		DataType [] arrayName = {data1, data2, data3 ... data_n};
		
		String [] array2 = {"abc", "pqr", "qwe"};  //3
		
		char [] arry3 = {'2', 'r', '@'};    // 3
		
		int [] array1 = {10,20,30,40,50};   // 7
		
		
		 int value = array1[4];
		 System.out.println(value);
		 
		 int arraySize = array1.length;
		 
		 System.out.println(arraySize);
		 
		 System.out.println(arry3.length);
		
		 array1[4] = 800;
		 
		 
		 System.out.println(array1[0]);
		 System.out.println(array1[1]);
		 System.out.println(array1[2]);
		 System.out.println(array1[3]);
		 System.out.println(array1[4]);
		 
		 System.out.println();
		 System.out.println("*** Print Array using loop *****");
		 System.out.println();
		 
		 
		 for(int index = 0; index < array1.length; index++)
		 {
			 System.out.println(array1[index]);
		 }
		 
		 System.out.println();
		 System.out.println("*** 2nd Syntax ***");
		 System.out.println();
		 
//		 SYNTAX 2: 
		 
//		 DataType [] arrayName = new DataType[arraySize];
		 
		 
		 int [] array4 = new int[5];
		 
		 
		 for(int index = 0; index < array4.length; index++)
		 {
			 System.out.println(array4[index]);
		 }
		 
		 array4[0] = 100;  // update value in array
		 
		 array4[3] = 300;
		 
		 System.out.println();
		 
		 for(int index = 0; index < array4.length; index++)
		 {
			 System.out.println(array4[index]);
		 }
		 
//		 Advanced version of for loop:  (for-each loop)
		 
//		 		 int [] array4 = new int[5];
		 
//		 SYNTAX:
		 
//		 for(DataType variableName : collectionVariable)
//		 {
//			 // logic on each variable
//		 }
		 
		 System.out.println();
		 System.out.println("*** ForEach loop ***");
		 System.out.println();
		 
		 for(int num : array4)
		 {
			 System.out.println(num);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
