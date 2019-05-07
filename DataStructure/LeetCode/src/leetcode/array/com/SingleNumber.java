package leetcode.array.com;

/*
 * https://leetcode.com/problems/single-number/#/description
 * 
 * Given an array of integers, every element appears twice except 
 * for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you 
implement it without using extra memory?
 * 
 */


public class SingleNumber {

	public static int singleNumber(int[] nums) {
        
		int result = 0;
	    for (int i = 0; i < nums.length ; i++ ){
			 result = result ^ nums[i];
	    }
		return result;
    }
	
	public static void main(String []args)
	{
		int []array = {2,3,2,3,5,5,6};
		System.out.println(singleNumber(array));
	}
}
