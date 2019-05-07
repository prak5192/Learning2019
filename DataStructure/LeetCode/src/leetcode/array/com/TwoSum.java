package leetcode.array.com;

/*
	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	Example:
	Given nums = [2, 7, 11, 15], target = 9,
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
 */

public class TwoSum {
	 public static  int[] twoSum(int[] nums, int target) 
	 {
		 boolean flag = false;
		 int [] returnValue = new int[2];
		 for(int i = 0; i< nums.length ; i++)
		 {
			 returnValue[0] = i;
			 for(int j = i+1; j< nums.length ; j++)
			 {
				 if(nums[i] + nums[j] == target){
					 returnValue[1] = j;
					 flag = true;
					 break;
				 }
			 }
			 if(flag)
			 {
				 break;
			 }
		 }
		 return returnValue;
	 }
	 
	 public static void main(String []args)
	 {
		 int []nums = {3, 2, 4};
		 int target = 6;
		 int [] result = twoSum(nums, target);
		 
		 for(int i = 0; i< result.length ; i++)
		 {
			 System.out.println(result[i]);
		 }
	 }
}
