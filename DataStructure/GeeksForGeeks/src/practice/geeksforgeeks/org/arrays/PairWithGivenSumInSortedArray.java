package practice.geeksforgeeks.org.arrays;

// https://practice.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array/0
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PairWithGivenSumInSortedArray {
	public static void main(String args[]) throws NumberFormatException, IOException{
		System.out.println("Starting the program.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println("value of n: " + n);
		String check = "";

		while (n > 0)
		{
			int x = Integer.parseInt(br.readLine());
			
			int arr[] = new int[x];
			String line  = br.readLine();
			String []str = line.trim().split("\\s+");
			
			for(int i = 0; i< str.length ; i++)
			{
				arr[i] = Integer.parseInt(str[i]);
			}
			
			Arrays.sort(arr);
			
			int sum = Integer.parseInt(br.readLine());
			for(int j = 0; j< x-1; j++)
			{
				for(int k = j+1; k < x-1 ; k++)
				{
					if(arr[j] + arr[k] == sum)
					{
						check = check + "a";
						System.out.println(arr[j]+" "+ arr[k]+" "+sum);
					}
					else
					{
						check = check + "b";
					}
				}
			}
			if(!check.contains("a"))
			{
				System.out.println(-1);
			}
			n--;
		}
	}
}
