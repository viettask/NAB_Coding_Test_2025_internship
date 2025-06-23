package NAB_Coding_Test_2025_internship;

//You are given an array of integers. 
//Your task is to create pairs of them, such that every pair consists of equal numbers.
//Each array element may belong to one pair only.
//It is possible to use all of the integers?
//Write a function:
//	class Solution{public boolean solution(int[] A;)}
//
//that, given an array A consisting of N integers, returns whether it is possible to split all integers into pairs.
//Examples:
//1. Given A=[1,2,2,1], your function should return True, 
//		as the pairs are (A[0], A[3]) (both have value 1) amd (A[1], A[2]) (both have value 2)
//2. Given A=[7,7,7], your function should return False, as you can make one pairs of numbers 7, 
//		but you still have a single 7 left
//3. Given A=[1,2,2,3], your function should return False, as there's nothing that A[0] can be paired with
//
//Write an efficient algorithm for the following assumptions:
//	N is an integer within the range [1..100,000];
//    each element of array A is an integer within the range [-1,000,000 .. 1,000,000].
//    
//Copyright 2009-2025 by Codility Limited. All Rights reserved. Unauthorised copying, publication or disclosure prohibited.   

import java.util.*;

public class hashMap_task1 {
	public boolean solution(int[] A)
	{
		//creating a new HashMap
		HashMap<Integer, Integer> freq = new HashMap<> ();
		
		
		
		for (int num: A)
		{
			freq.put(num, freq.getOrDefault(num, 0)+ 1);
		}
		
		System.out.println("New HashMap: " + freq);
		
		for (int count: freq.values())
		{
			if(count%2!=0)
			{
				return false;
			}				
		}
		
		return true;
	}	
	
    public static void main(String[] args) {
    	hashMap_task1 task = new hashMap_task1();  // create object
    	System.out.println(task.solution(new int[] {1,2,2,1}));
    	System.out.println(task.solution(new int[] {7,7,7}));
    	System.out.println(task.solution(new int[] {1,2,2,3}));
    	System.out.println(task.solution(new int[] {5,1,1,5,3,3}));
    }
}
