package NAB_Coding_Test_2025_internship;

//Creating HashMap
//https://kungfutech.edu.vn/bai-viet/java/hashmap-trong-java
//https://tayjava.vn/hashmap-trong-java

import java.util.HashMap;

// Xử lý dữ liệu theo cặp giá trị key/value

//Kết quả
//
//HashMap1: {Four=4, Two=2}
//HashMap2: {Two=2, Three=3, Four=4}

public class hashMap_practice1 {
public static void main (String[] args)
{
	//creating a hashMap of even numbers
	HashMap<String, Integer> evenNumbers = new HashMap<> ();
	evenNumbers.put("Two", 2);
	evenNumbers.put("Four", 4);	
	
	System.out.println("HashMap1: "+evenNumbers);
	
	//Creating a hash map from other hashmap
	HashMap<String, Integer> numbers = new HashMap<> (evenNumbers);
	numbers.put("Tree",3);
	System.out.println("HashMap2: "+numbers);
}
}
