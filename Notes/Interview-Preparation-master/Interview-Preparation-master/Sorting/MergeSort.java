package com.grv.sorting;

/**
 * T(n) = 2T(n/2) + \Theta(n)
 * Best Case : O(nlogn)
 * Worst Case : O(nlogn)
 * Avg Case : O(nlogn)
 * Auxiliary Space : O(n)
 */

public class MergeSort {
	
	public static void sort(int[] arr) {
		mergeSort(arr, 0, arr.length - 1);
	}
	
	public static void mergeSort(int[] arr, int low, int high) {
		if(low < high) {
			int mid = (low + high)/2;
			
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1,high);
			
			merge(arr, low, mid , high);
		}
	}
	
	public static void merge(int[] arr, int low, int mid , int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			left[i] = arr[low + i];
		}
		
		for(int j = 0; j < n2; j++ ) {
			right[j] = arr[mid + j + 1];
		}
		
		int i = 0; 
		int j = 0;
		int k = low;
		
		while(i < n1 && j < n2) {
			if(left[i] < right[j]) {
				arr[k++] = left[i++];
			}
			else
				arr[k++] = right[j++];
		}
		
		while(i < n1) {
			arr[k++] = left[i++];
		}
		
		while(j < n2) {
			arr[k++] = right[j++];
		}
	}

}
