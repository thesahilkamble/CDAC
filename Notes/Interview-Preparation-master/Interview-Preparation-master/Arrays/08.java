package com.grv.randomPractice;
import java.util.*;

public class Practice {
	
	public static int minimumSumOfAbsoluteDifferenceOfPairs(int[] arr1, int[] arr2){
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int sum = 0;
		
		for(int i = 0; i<arr1.length; i++) {
			sum+= Math.abs(arr1[i] - arr2[i]);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = {4, 1, 8, 7};
		int[] arr2 = {2, 3, 6, 5};
		System.out.println(minimumSumOfAbsoluteDifferenceOfPairs(arr1, arr2));	
	}
}
