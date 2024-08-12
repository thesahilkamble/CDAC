import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     
	     while(t-- > 0){
	         int n = sc.nextInt();
	         
	         int[] arr = new int[n];
	         int[] left = new int[n];
	         int[] right = new int[n];
	         
	         
	         
	         for(int i = 0; i<n; i++){
	             arr[i] = sc.nextInt();
	         }
	         
	         left[0] = arr[0];
	         right[n-1] = arr[n-1];
	         
	         int sum = 0;
	         
	         for(int i = 1; i<n; i++){
	             left[i] = Math.max(arr[i], left[i-1]);
	         }
	         
	         for(int i = n-2; i>=0; i--){
	             right[i] = Math.max(arr[i], right[i+1]);
	         }
	         
	         for(int i = 1; i<n-1; i++){
	             sum+= (Math.min(left[i], right[i]) - arr[i]);
	         }
	         
	         System.out.println(sum);
	         
	     }
	}
}
