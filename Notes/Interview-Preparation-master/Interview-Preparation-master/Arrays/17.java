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
	         int[] dp = new int[n];
	         
	         for(int i = 0; i<n; i++){
	             arr[i] = sc.nextInt();
	         }
	         
	         for(int i= 0; i<n; i++){
	             dp[i] = sc.nextInt();
	         }
	         
	         Arrays.sort(arr);
	         Arrays.sort(dp);
	         
	         int trains = 1;
	         int max = 1;
	         
	         int i= 1;
	         int j = 0;
	         
	         while(i < n && j < n){
	             if(arr[i] < dp[j]){
	                 i++;
	                 trains++;
	                 
	                 if(max < trains)
	                    max = trains;
	                 
	             }
	             else{
	                 j++;
	                 trains--;
	             }
	         }
	         
	         System.out.println(max);
	         
	     }
	}
}
