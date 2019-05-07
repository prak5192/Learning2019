package leetcode.array.com;

/*
 * https://leetcode.com/problems/remove-element/#/description
 
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
 
 */
public class RemoveElement {
	public static int removeElement(int array[], int elem) {
		int size=0;
		int n = array.length;
		for(int i=0;i<n;i++)
		{
			if(array[i] == elem)
			{
				for(int j = i+1;  j< n ; j++ )
				{
					if(array[j] != elem){
						int temp = array[j];
						array[j]  = array[i];
						array[i] = temp;
					}else {
						continue;
					}
				}
			}
		}
		
		 for(int j = 0; j< array.length ; j++)
		 {
			 System.out.println(array[j]);
		 }
		
		for(int k = 0; k< array.length ; k++)
		{
			size =  k+1;
			if(array[k] == elem )
			{
				size--;
				break;
			}
		}
		return size;
	}
	
	public static void main(String []args)
	{
		int []array = {2};
		System.out.println(removeElement(array, 3 ));
	}

}
