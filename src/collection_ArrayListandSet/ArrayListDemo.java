package collection_ArrayListandSet;

 

import java.util.ArrayList;

public class ArrayListDemo {
//can accept dulicate values-ArrayList,LinkedList, Vectors
	//difference between Array and ArrayList
	//ArrayList can grow dynamicaly 
	//You can access and insert any values in Array List
	public static void main(String[] args) {
		/*ArrayList arr= new ArrayList();- Can be defined in this manner but the problem is data type is not 
		 * specified. Also we can add values in between dynamically between two existing indexas well.The 
		 * values can be removed,searched and fetched very easily without using for-loops.
		 * */
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Meghana");
		arr.add("Suraj");
		arr.add("Munnu");
		System.out.println( arr.get(1));//to get elements via index
		arr.add(0, "Best");//to add values in between to existing array
		System.out.println(arr);
		System.out.println(arr.contains("Munnu"));// to check whether a string is present or not
		arr.remove("Best");//removal of elements
		System.out.println(arr);
		System.out.println(arr.indexOf("Munnu"));
}
}
