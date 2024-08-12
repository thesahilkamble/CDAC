package com.grv.sorting;

/*
Best Case  : O(n)
Avg Case   : O(n^2)
Worst Case : O(n^2)
Stable Sort
Inplace Algorithm
*/

public class BubbleSort {
	
	public static void sort(int[] arr) {
		
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++) {
			boolean flag = false;
			for(int j = 0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(flag == false)
				break;
		}
	}
}
