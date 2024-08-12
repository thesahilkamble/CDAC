package com.grv.sorting;

/*
 *  Best Case  : O(nlong)
	Avg Case   : O(nlong)
	Worst Case : O(n^2)
	UnStable Sort
	Inplace Algorithm (O(logn) for recursion stack space)
	Perform best when array divided into almost half
	perform worst when array is sorted in either fashion
	
	Very Good Article : http://www.geeksforgeeks.org/quick-sort/
 */

public class QuickSort {
	
	public static void sort(int[] arr) {
		quickSort(arr,0,arr.length-1);
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int index = partition(arr,low,high);
			
			quickSort(arr, 0, low-1);
			quickSort(arr, low+1, high);
		}
	}
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		
		for(int j = low; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
				
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		
		int temp = arr[high];
		arr[high] = arr[i+1];
		arr[i+1] = temp;
		
		return i+1;
	}

}
