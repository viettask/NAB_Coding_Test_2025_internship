package NAB_Coding_Test_2025_internship;

//You are given an implementation of a function solution that,
//given a positive integer N, prints to standard output another integer,
//which was formed by reversing a decimal representation of N.
//The leading zeros of the resulting integer should not be printed by the function.
//Examples:
//1. Given N=54321, the function should print 12345
//2. Given N=10011, the function should pring 11001
//3. Given N=1, the function should print 1
//The attached code is still incorrect for some inputs. Despite the error(s),
//the code may produce a correct answer for the example test cases.
//The goal of the exercise is to find and fix the bug(s) in the implementation.
//You can modify at most 3 lines.

// LeetCode7 : reverse integer

public class reversingInteger_task2 {
	public int reverse(int x) {
		long rev = 0;
	
		while(x!=0)
		{
		rev = rev* 10+ (x%10);
		x/=10;
		
//		Early overflow check
		if(rev > Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
		}
	
		return (int) rev;
	}
	
//public void solution(int N)
//{
//	while(N>0)
//	{
//		int enable_print = N % 10;
//		if (enable_print == 0 && N%10!=0)
//		{
//			enable_print=1;
//		}
//		else if(enable_print ==1)
//		{
//			System.out.print(N%10);
//		}
//		N=N/10;
//	}
//}

public void solution(int N)
{ 	System.out.println();
	boolean leadingZero = true;
	while(N>0)  //Loop through each digit of the number from right to left (units digit to most significant digit)
	{
		int enable_print = N % 10;  //get the last digit of N
		if (enable_print != 0 || !leadingZero)
		{
			System.out.print(enable_print);
			leadingZero=false;
		}
		N=N/10;
	}	
		//special case: N was 0
		if(leadingZero)
		{
			System.out.print(0);
		}
}

	public static void main(String[] args) {
		reversingInteger_task2 task = new reversingInteger_task2();  // create object
    	System.out.println(task.reverse(54321));	//12345 
    	System.out.println(task.reverse(10011));	//11001
    	System.out.println(task.reverse(1));	//1
    	System.out.println(task.reverse(10));	//1
    	System.out.println(task.reverse(1200));	//21
    	System.out.println(task.reverse(1000));	//1
    	//Edge cases
    	System.out.println(task.reverse(0));	//0 Single digit zero
    	System.out.println(task.reverse(1000000000));	//1 Leading 9 zeros removed
    	System.out.println(task.reverse(2147483647));	//7463847412 Max int, reversed is within range
    	System.out.println(task.reverse(100));	//1 Two trailing zeros become leading
    	System.out.println(task.reverse(101010)); //10101 Last zero dropped
       	System.out.println(task.reverse(111111111));	//111111111 Same forwards and backwards
       	//Overflow case
       	System.out.println(task.reverse(1534236469));	//Overflow (not needed if you're ignoring bounds) 	
       	System.out.println();
    	task.solution(54321);	//12345 
    	task.solution(10011);	//11001
    	task.solution(1);	//1
    	task.solution(10);	//1  	
    	task.solution(1200);	//21  
    	task.solution(1000);	//1
    	//Edge cases
    	task.solution(0);
    	task.solution(1000000000);
    	task.solution(2147483647);
    	task.solution(100);
    	task.solution(101010);
    	task.solution(111111111);
    	//Overflow case
    	task.solution(1534236469);
	}
}
