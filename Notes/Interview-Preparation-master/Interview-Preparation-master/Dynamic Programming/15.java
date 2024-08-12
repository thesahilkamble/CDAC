import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     
	     while(t-- > 0){
	         int k = sc.nextInt();
	         int n = sc.nextInt();
	         
	         int[] arr = new int[n];
	         
	         for(int i = 0; i<n; i++){
	             arr[i] = sc.nextInt();
	         }
	         
	         int[] dp = new int[k + 1];
	         
	         for(int i = 0; i<n; i++){
	             for(int j = 0; j<=k; j++){
	                 
	                 if(j == arr[i]){
	                     dp[j] = 1;
	                 }
	                 if(j > arr[i] && dp[j-arr[i]] != 0){
	                     
	                     if(dp[j]== 0)
	                        dp[j] = dp[j-arr[i]]  +1;
	                     else
	 	                    dp[j] = Math.min(dp[j], dp[j-arr[i]]  + 1);
	                 }
	             }
	         }
	         
	         if(dp[k] == 0)
	            System.out.println("-1");
	         else 
	           System.out.println(dp[k]);
	     }
	}
}
