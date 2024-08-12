import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     
	     while(t-- > 0){
	         int n = sc.nextInt();
	         int k = sc.nextInt();
	         
	         int[] arr = new int[n];
	         
	         for(int i = 0; i<n; i++){
	             arr[i] = sc.nextInt();
	         }
	         
	         for(int i = 0; i<=n-k ; i++){
	             int max = arr[i];
	             
	             for(int j = i ; j<i+k; j++){
	                 if(max < arr[j])
	                    max = arr[j];
	             }
	             System.out.print(max+" ");
	         }
	         System.out.println();
	         
	     }
	}
}
