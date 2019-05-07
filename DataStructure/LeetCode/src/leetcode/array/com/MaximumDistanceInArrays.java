package leetcode.array.com;

/*
 * https://leetcode.com/problems/maximum-distance-in-arrays/#/description
Given m arrays, and each array is sorted in ascending order. Now you can pick up 
two integers from two different arrays (each array picks one) and calculate the distance. 
We define the distance between two integers a and b to be their absolute difference |a-b|. 
Your task is to find the maximum distance.

Example 1:
Input: 
[[1,2,3],
 [4,5],
 [1,2,3]]
Output: 4

Explanation: 
One way to reach the maximum distance 4 is to pick 1 in the first or third array and pick 5 
in the second array.

Note:
Each given array will have at least 1 number. There will be at least two non-empty arrays.
The total number of the integers in all the m arrays will be in the range of [2, 10000].
The integers in the m arrays will be in the range of [-10000, 10000].
 * 
 */
public class MaximumDistanceInArrays {

	public static int maximumDistanceInArrays( int [][] nums )
	{
		int length = nums.length;
		int [][] test = new int[length][2];
		
		for(int i =0 ; i< length ; i++){
			test[i][0] = nums[i][0];
			if(nums[i].length > 1){
				test[i][1] = nums[i][nums[i].length -1];
			}
		}
		
		int min = test[0][0];
		int max = test[0][1]; 
		for(int i = 0; i < test.length - 1 ; i++){
			if( min >  test[i+1][0]){
				min = test[i+1][0];
			}
			if(max < test[i+1][1]){
				max = test[i+1][1];
			}
		}
		
		System.out.println("max: " + max + ", min: " + min );
		
		return max - min;
	}
	
	
	 public static void main(String []args)
	 {
		 int [][] arr = {{1,2,3},{4,5}, {1,2,3}};
		 System.out.println(maximumDistanceInArrays(arr));
		 
	 }
}
