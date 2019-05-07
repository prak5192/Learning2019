package com.dataStructure.Array.ArrayRotation;

//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.

public class RotateMethod {
	
	public static void main(String args[])
	{
		int []arr ={1,2,3,4,5,6,7};
		RotateMethod obj = new RotateMethod();
		
		System.out.println("Before roataing the array");
		for(int i = 0 ; i< arr.length; i++)
		{
			System.out.print(arr[i] + " ");
			
		}
		
		obj.rotate(arr, 3,arr.length);
		System.out.println("\nAfter roataing the array");
		for(int i = 0 ; i< arr.length; i++)
		{
			System.out.print(arr[i] + " ");
			
		}
	}
	
	
	public void rotate(int arr[], int d, int n)
	{
		for(int j = 0; j < d; j++){
			leftRotateByOne(arr,n);
		}
	}
	
	public void leftRotateByOne(int []arr, int n)
	{
		int temp = arr[0];
		
		for(int i = 0 ; i< n-1; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[n-1]  = temp;
		
	}

}
