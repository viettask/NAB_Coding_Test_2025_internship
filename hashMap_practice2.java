package NAB_Coding_Test_2025_internship;

//Insert items into hashMap
//https://kungfutech.edu.vn/bai-viet/java/hashmap-trong-java
//https://tayjava.vn/hashmap-trong-java

import java.util.HashMap;

//Kết quả
//
//HashMap of even numbers: {Six=6, Four=4, Two=2}
//HashMap of numbers: {Six=6, One=1, Four=4, Two=2}

public class hashMap_practice2 {
	public static void main (String[] args)
	{
	//Creating HashMap of even numbers
	HashMap<String, Integer> evenNumbers = new HashMap<> ();
	
	//Using put()
	evenNumbers.put("Two", 2);
	evenNumbers.put("Four", 4);
	
	//Using putIfAbsent()
	evenNumbers.putIfAbsent("Six",6);
    System.out.println("HashMap of even numbers: " + evenNumbers);
	
    //Creating HashMap of numbers
    HashMap<String, Integer> numbers = new HashMap<>();
    numbers.put("One", 1);

    // Using putAll()
    numbers.putAll(evenNumbers);
    System.out.println("HashMap of numbers: " + numbers);
	}
}
