package NAB_Coding_Test_2025_internship;

//1404. Number of Steps to Reduce a Number in Binary Representation to One
//
//Given the binary representation of an integer as a string s, return the number of steps to reduce it to 1 under the following rules:
//
//If the current number is even, you have to divide it by 2.
//
//If the current number is odd, you have to add 1 to it.
//
//It is guaranteed that you can always reach one for all test cases.
//
// 
//
//Example 1:
//
//Input: s = "1101"
//Output: 6
//Explanation: "1101" corressponds to number 13 in their decimal representation.
//Step 1) 13 is odd, add 1 and obtain 14. 
//Step 2) 14 is even, divide by 2 and obtain 7.
//Step 3) 7 is odd, add 1 and obtain 8.
//Step 4) 8 is even, divide by 2 and obtain 4.  
//Step 5) 4 is even, divide by 2 and obtain 2. 
//Step 6) 2 is even, divide by 2 and obtain 1.  
//Example 2:
//
//Input: s = "10"
//Output: 1
//Explanation: "10" corresponds to number 2 in their decimal representation.
//Step 1) 2 is even, divide by 2 and obtain 1.  
//Example 3:
//
//Input: s = "1"
//Output: 0
// 
//
//Constraints:
//
//1 <= s.length <= 500
//s consists of characters '0' or '1'
//s[0] == '1'

public class leetcode1404 {    public int numSteps(String s) {
    int steps = 0;
    int carry = 0;

    // int decimal = Integer.parseInt(s, 2);
    // System.out.println(decimal+"\n");
    
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
}
