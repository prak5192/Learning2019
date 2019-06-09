package com.Array;

/*
 * Given an array of integers, return indices of the 
 * two numbers such that they add up to a specific target
 */


import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[]args)
	{
		
		int[] numbers = {2,7,11,15};
		int target = 26;
		TwoSum obj = new TwoSum();
		int [] result  = obj.twosum(numbers, target);
		
		for(int i = 0; i< result.length ; i++)
		{
			System.out.print(result[i] + " ");
		}
	}
	
	
	
	public int [] twosum(int []num, int target)
	{
		int [] arr = new int[2]; 
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i< num.length; i++)
		{
			Integer val = map.get(target - num[i]);
			if(val == null)
			{
				map.put(num[i], i);
			}
			else
			{
				arr[0] = val;
				arr[1] = i;
				break;
			}
		}
		return arr;
	}
}
