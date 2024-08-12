package com.grv.randomPractice;
import java.util.*;

public class Practice {
	
	public static int minimumContiguousSubarray(int[] arr){
		
		int min_sum = Integer.MAX_VALUE;
		int curr_sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			curr_sum+= arr[i];
			
			if(curr_sum < min_sum)
				min_sum = curr_sum;
			
			if(curr_sum > 0)
				curr_sum = 0;
		}
		return min_sum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3, -4, 2, -3, -1, 7, -5};
		System.out.println(minimumContiguousSubarray(arr));	
	}
}
