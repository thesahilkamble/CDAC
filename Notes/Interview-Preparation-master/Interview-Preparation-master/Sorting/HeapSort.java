package com.grv.sorting;

public class HeapSort {
	
	public static void sort(int[] arr) {
		heapSort(arr);
	}
	
	public static void heapSort(int[] arr) {
		
		int n = arr.length;
		
		//Building max heap
		for(int i = n/2 - 1; i>=0; i--) {
			heapify(arr, n, i);
		}
		
		
		for(int i = n-1; i>=0; i--) {
			
			// Swapping first(maximum) and last of array
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			
			// heapify reduced heap
			heapify(arr, i, 0);
		}
		
		
	}
	
	public static void heapify(int[] arr, int n, int i) {
		
		int left = 2*i  + 1;
		int right = 2*i + 2;
		int largest = i;
		
		if(left < n && arr[left] > arr[i]) {
			largest = left;
		}
		
		if(right < n && arr[right] > arr[largest]) {
			largest = right;
		}
		
		if(i!= largest) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, n, largest);
		}
	}
}
