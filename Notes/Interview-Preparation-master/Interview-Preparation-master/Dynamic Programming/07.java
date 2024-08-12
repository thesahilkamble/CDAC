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
	             dp[i] = Integer.MAX_VALUE;
	         }
	         
	         dp[0] = 0;
	         
	         boolean found = false;
	         
	         for(int i = 1; i<n; i++){
	             
	             int j = 0;
	             while(j < i){
	                 if(dp[j]!= Integer.MAX_VALUE && arr[j] + j >= i){
	                     
    	                 if(dp[j] + 1 < dp[i]){
    	                     dp[i] = dp[j] + 1;
    	                 }
	                 }
	                 j++;
	             }
	         }
	         
	         if(dp[n-1] == Integer.MAX_VALUE)
	            System.out.println("-1");
	         else
	            System.out.println(dp[n-1]);
	            
	        
	     }
	}
}
