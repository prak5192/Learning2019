package leetcode.array.com;

/*
https://leetcode.com/problems/number-of-1-bits/#/description

Write a function that takes an unsigned integer and returns the number of ’1' 
bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, 
so the function should return 3.

*/
public class NumberOf1Bits {
	// you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
    	int count;
	    for (count=0; n !=0 ; count++)
	        n = n & (n-1);
	    return count;
    }
    
    public static void main(String []args)
	{
		int array = 11;
		System.out.println(hammingWeight(array));
	}
}
