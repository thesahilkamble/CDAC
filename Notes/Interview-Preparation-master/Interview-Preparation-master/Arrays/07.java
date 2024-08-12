package com.grv.randomPractice;
import java.util.*;

public class Practice {
	
	public static int minimumAbsoluteDifference(int[] arr){
		
		int min_diff = Integer.MAX_VALUE;
		Arrays.sort(arr);
		
		for(int i = 0; i<arr.length-1; i++) {
			int diff = arr[i+1] - arr[i];
			if(diff < min_diff)
				min_diff = diff;
			if(diff == 0)
				return diff;
		}
		return min_diff;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 5, 3, 19, 18, 25};
		System.out.println(minimumAbsoluteDifference(arr));	
	}
}
