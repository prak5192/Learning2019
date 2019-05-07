package practice.geeksforgeeks.org.arrays;
//https://practice.geeksforgeeks.org/problems/java-1-d-and-2-d-array/0#ExpectOP

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Java1DAnd2DArray {
	
	public static void main(String arg[]) throws Exception, IOException
	{
		Java1DAnd2DArray obj = new Java1DAnd2DArray();
		obj.way2();
		obj.way1();
		
		
	}
	
	public void way2() throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i< t ; i++)
		{
			int n = Integer.parseInt(br.readLine());
			int[][]array2d = new int[n][n];
			
			String line  = br.readLine();
			String []str = line.trim().split("\\s+");
			
			
			// Convert 1D array to 2D array.
			for(int p=0; p<str.length;p++)
			{
				int x = p/n;
				int y = p%n;
				array2d[x][y] = Integer.parseInt(str[p]); 
			}
			
			int sum = 0;
			for(int z =0; z < n; z++)
			{
				sum  = sum + array2d[z][z];
			}
			System.out.print(sum + " ");
			
			line  = br.readLine();
			str = line.trim().split("\\s+");
			
			int []array1d = new int[n];
			
			for(int c = 0; c< str.length ; c++)
			{
				array1d[c] = Integer.parseInt(str[c]); 
			}
			int max = array1d[0];
			for(int d = 1; d< n ;d++)
			{
				if(max < array1d[d])
				{
					max = array1d[d];	
				}
			}
			System.out.println(max + " ");
		}
	}
	
	public void way1()
	{
		int n = 3;
		int [][]array2D = new int[n][n];
		int start = 1;
		
		for(int i =0; i < n; i++)
		{
			for(int j =0; j<n; j++)
			{
				array2D[i][j] = start;
				start++;
			}
		}
		
		int sum = 0;
		for(int i =0; i < n; i++)
		{
			sum  = sum + array2D[i][i];
		}
		System.out.println("The sum of diagnoals of the matrix: " + sum );
		
		System.out.println("Finding max element from the 1 D Array.");
		
		int []array1D = new int[n];
		
		for(int i = 0; i< n; i ++){
			Random rand = new Random();
			array1D[i] = rand.nextInt(50) + 1;
			System.out.print(array1D[i] + " ");
		}
		
		System.out.println();
		
		int maxElement = array1D[0];
		for(int i = 1; i< n; i ++){
			if(maxElement < array1D[i])
			{
				maxElement = array1D[i];	
			}
		}
		
		System.out.println("Max element from the 1 D Array: " + maxElement);
	}
	
	

}
