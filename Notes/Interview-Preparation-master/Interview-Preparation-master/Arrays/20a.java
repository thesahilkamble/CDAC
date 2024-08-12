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
	         
	         for(int i = 0; i<n; i++){
	             arr[i] = sc.nextInt();
	         }
	         
	         int sum = 0;
	         
	         for(int i = 1; i<n-1; i++){
	             
	             int maxLeft = -1;
	             int maxRight = -1;
	             
	             for(int j = 0; j<i; j++){
	                 if(maxLeft < arr[j])
	                    maxLeft = arr[j];
	             }
	             
	             for(int j = i+1; j<n; j++){
	                 if(maxRight < arr[j])
	                    maxRight = arr[j];
	             }
	             
	             int min = maxLeft < maxRight ? maxLeft : maxRight;
	             
	             if(min - arr[i] > 0){
	                 
	                 sum += min - arr[i];
	             }
	         }
	         
	         System.out.println(sum);
	         
	     }
	}
}
