package learn.datastructure.array;

import java.util.Map;
import java.util.TreeMap;

public class MinimumSwapRequiredToSortAArray {
	
	public int minSwaps(int[] A, int N)
	{
	    int i = 0;
	    Map<Integer,Integer> resMap = new TreeMap<>();
	    for(; i < N; i++) {
	        resMap.put(A[i],i);
	    }
	    i = 0;
	    for(Map.Entry<Integer,Integer> entry : resMap.entrySet()) {
	        entry.setValue(i++);
	    }
	    int swap = 0;
	    for(i = 0; i < N; ) {
	        if(resMap.get(A[i]) != i) {
	            int temp = A[i];
	            A[i] = A[resMap.get(temp)];
	            A[resMap.get(temp)] = temp;
	            swap++;
	        }
	        else {
	            i++;
	        }
	    }
	    return swap;
    }
	
	public static void main(String [] args){
		MinimumSwapRequiredToSortAArray obj = new MinimumSwapRequiredToSortAArray();
		//int[] myIntArray = new int[]{4, 3, 2, 1};
		//System.out.println("Minimum Count: " + obj.minSwaps(myIntArray, 4));
		
		int[] secondattempt = new int[]{6, 4, 8, 7, 20, 18, 19};
		System.out.println("Minimum Count: " + obj.minSwaps(secondattempt, secondattempt.length));
	}
}
