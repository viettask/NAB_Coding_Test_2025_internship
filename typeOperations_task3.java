package NAB_Coding_Test_2025_internship;

//You are given a string S of length N which encodes a non-negative number V in a binary form.
//Two types of operations may be performed on it to modify its value:
//	If V is odd, subtract 1 from it
//	If V is even, divide it by 2
//These operations are performed until the value of V becomes 0.
//
//For example, if string S="011100", its value V initially is 28.
//The value of V would change as follows:
//	V=28, which is even: divide by 2 to obtain 14;
//	V=14, which is even: divide by 2 to obtain 7;
//	V=7, which is odd: subtract 1 to obtain 6;
//	V=6, which is even: divide by 2 to obtain 3;
//	V=3, which is odd: subtract 1 to obtain 2;
//	V=2, which is even: divide by 2 to obtain 1;
//	V=1, which is odd: subtract 1 to obtain 0;

//	Leetcode 1404: Number of steps to reduce a number in binary representation to one

// 	Leetcode 1342: Number of steps to reduce a number to zero

//It is not correct

//Original Logic (Iterative on Decimal):
// Works for small binary strings, ❌ fails on long ones due to Integer limit.
public class typeOperations_task3 {
	   public static int numSteps(String s) {
	        int decimal = Integer.parseInt(s, 2);
	        int steps=0;

	        while(decimal>0)
	        {
	            if(decimal%2 == 0)
	            {
	                decimal/=2;
	            }
	            else
	            {
	                decimal--;
	            }
	            steps++;
	        }
	        return steps;
	    }
	   
//More efficient and better than converting the entire binary string to an integer, especially for very large binary string (hundreds or thousands of bits)
//Avoids overflow, which Integer.parseInt() can hit for strings >32 bits.
//Uses carry logic to simulate binary addition/division operations step-by-step.
	    public static int numSteps1(String s) {
	        int steps = 0;
	        int carry = 0;

	        int decimal = Integer.parseInt(s, 2);
	        System.out.println(decimal+"\n");
	        
	        // Traverse the binary string from right to left, ignoring the leftmost '1'
	        for (int i = s.length() - 1; i > 0; i--) {
	            int bit = s.charAt(i) - '0';  // convert character to integer (either 0 or 1)
	            System.out.println(bit);
	            bit += carry;

	            if (bit == 1) {
	                steps += 2;  // 1 -> +1 to make it even, then /2
	                carry = 1;   // the +1 might cause a carry
	            } else {
	                steps += 1;  // 0 -> just divide by 2
	            }
	        }

	        // After finishing all bits except the first one, if we have a leftover carry
	        // (e.g., 1 becomes 10), we need one final step
	        return steps + carry;
	    }
	    
		public static void main(String[] args) {
			System.out.println("\nSteps taken: "+numSteps1("011100"));
			System.out.println("\nSteps taken: "+numSteps("011100"));
		}
}
