package leetcode.array.com;

/*
 * https://leetcode.com/problems/can-place-flowers/#/description
 * 
Suppose you have a long flowerbed in which some of the plots are planted 
and some are not. However, flowers cannot be planted in adjacent plots - 
they would compete for water and both would die.
Given a flowerbed (represented as an array containing 0 and 1, where 0 means 
empty and 1 means not empty), and a number n, return if n new flowers can be 
planted in it without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: True

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: False

Note:
The input array won't violate no-adjacent-flowers rule.
The input array size is in the range of [1, 20000].
n is a non-negative integer which won't exceed the input array size.

 
 */
public class CanPlaceFlowers {

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
     
		int count= 0;
		boolean flag = false;
		int j = 0 ;
		if(flowerbed.length == 1 && flowerbed[0] ==0)
		{
			count++;
			flag = !flag;
			j = 0;
		}
		else if(flowerbed.length >= 2 && flowerbed[0] == 0 && flowerbed[1] == 0)
		{
			count++;
			flag = !flag;
			j = 0;
		}
		
		
		
		for(int i = 1; i< flowerbed.length ; i++ )
		{
			if(flowerbed[i] == 0  && flowerbed[i -1] == 0 )
			{
				if(((i+1) < flowerbed.length) && flowerbed[i+1] == 0)
				{
					if(j != i - 1)
					{
						j = i;
						count++;
					}
					
				}
			}
		}
		if(flowerbed.length > 2){
			if(j != flowerbed.length - 2)
			{
				if(flowerbed[flowerbed.length -1] == 0 && flowerbed[flowerbed.length -2] == 0 )
				{
					count++;
				}
			}
		}
		
		System.out.println(count);
		if(count >= n)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
    }
	
	
	// From Leetcode Greedy Solution
	
	public boolean canPlaceFlowersGreedySolution(int[] flowerbed, int n) 
	{
	    int count = 0;
	    for(int i = 0; i < flowerbed.length && count < n; i++) {
	        if(flowerbed[i] == 0) {
	        	//get next and prev flower bed slot values. If i lies at the ends the next and prev are considered as 0. 
	           int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1]; 
	           int prev = (i == 0) ? 0 : flowerbed[i - 1];
	           if(next == 0 && prev == 0) {
	               flowerbed[i] = 1;
	               count++;
	           }
	        }
	    }
	    
	    return count == n;
	}
	
	
	 public static void main(String []args)
	 {
		 //int []nums = {0};
		 //int []nums = {1,0,0,0,1,0,0};
		 //int []nums = {0, 0, 1,0,1};
		 //int []nums = {1, 0, 0,0,0};
		 //int []nums = {1,0,0,0,0,1};
		 int []nums = {0,0,1,0,0};
		 System.out.print(canPlaceFlowers(nums, 1));
		 
	 }
	
}
