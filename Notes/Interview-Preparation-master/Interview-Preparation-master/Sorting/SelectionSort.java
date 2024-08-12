package com.grv.sorting;

/*
Best Case  : O(n^2)
Avg Case   : O(n^2)
Worst Case : O(n^2)
Stable Sort
Inplace Algorithm
Minimum will come at its place in each iteration
*/

public class SelectionSort {
	
	public static void sort(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
