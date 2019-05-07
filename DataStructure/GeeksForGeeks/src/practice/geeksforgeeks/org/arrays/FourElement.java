package practice.geeksforgeeks.org.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://practice.geeksforgeeks.org/problems/four-elements/0
public class FourElement {
	
	
	public static void main(String args[]) throws Exception, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i< t ; i++)
		{
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			
			String line  = br.readLine();
			String []str = line.trim().split("\\s+");
			
			int sum = Integer.parseInt(br.readLine());
			
			for(int p=0; p<str.length;p++)
			{
				a[p] = Integer.parseInt(str[p]); 
			}
			
			
			
		}
		
	}

}
