package leetcode.array.com;

/*
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/#hints
Given an integer array, you need to find one continuous subarray that if you 
only sort this subarray in ascending order, then the whole array will be sorted 
in ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5

Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make 
the whole array sorted in ascending order.

Note:
Then length of the input array is in range [1, 10,000].
The input array may contain duplicates, so ascending order here means <=.

 
 */

public class ShortestUnsortedContinuousSubarray {
	
	
	public static int shortestUnsortedContinuousSubarray(int [] arr){
		int firstIndex = 0;
		int lastIndex = 0;
		boolean flag = true;
		for(int i = 0; i< arr.length -1 ; i++){
				if(flag){
					if(arr[i] > arr[i+1] || arr[firstIndex] > arr[i+1]){
						firstIndex = i;
						flag =  false;
						lastIndex = i+1;
					}
				}else{
					if(arr[i] > arr[i+1] || arr[firstIndex] > arr[i+1]){
						lastIndex = i+1;
					}
				}
				
		}
		
		System.out.println("lastIndex value: " + lastIndex + ", firstIndex value: " + firstIndex );
		if(lastIndex != 0 || firstIndex != 0){
            return  lastIndex - firstIndex +1;
        }else{
            return 0;
        }
	}
	
	/*
	 * Solution from net.
	 * I use the variables beg and end to keep track of minimum subarray A[beg...end] 
	 * which must be sorted for the entire array A to be sorted. 
	 * If end < beg < 0 at the end of the for loop, then the array is already fully sorted.
	 * https://discuss.leetcode.com/topic/89282/java-o-n-time-o-1-space/2
	 */
	public static int findUnsortedSubarray(int[] A) {
	    int n = A.length;
	    int beg = -1; 
	    int end = -2; 
	    int min = A[n-1]; 
	    int max = A[0];
	    for (int i=1;i<n;i++) {
	      max = Math.max(max, A[i]); //from left to right, search the current max
	      min = Math.min(min, A[n-1-i]); //from right to left, search the current min 
	      if (A[i] < max){
	    	  end = i;
	      }
	      if (A[n-1-i] > min){ 
	    	  beg = n-1-i; 
	      }
	    }
	    System.out.println("lastIndex value: " + end + ", firstIndex value: " + beg );
	    return end - beg + 1;
	}
	
	public static void main(String []args){
		//int []nums = {1,2,3,3,3};
		//int []nums = {1,3,2,2,2};
		//int [] nums = {2,6,4,8,10,9,15};
		//int [] nums = {2,1};
		//int [] nums = {5,4,3,2,1};
		int [] nums = {2,3,3,2,4};
		System.out.println(shortestUnsortedContinuousSubarray(nums));
		System.out.println(findUnsortedSubarray(nums));
	}

}
