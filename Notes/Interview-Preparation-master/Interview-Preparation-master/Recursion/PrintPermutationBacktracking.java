/*package whatever //do not write package name here */

import java.io.*;

class PrintPermutationBacktracking {
    
    public static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printPermutation(char[] arr, int l, int r){
        if(l == r){
            String s = new String(arr);
            System.out.println(s);
            return;
        }
        
        for(int i = l; i<=r; i++){
            swap(arr, l, i);
            printPermutation(arr, l + 1, r);
            swap(arr, l, i);
        }
    }
	public static void main (String[] args) {
		String s = "abc";
		char[] arr = s.toCharArray();
		
		printPermutation(arr, 0, s.length() - 1);
	}
}
