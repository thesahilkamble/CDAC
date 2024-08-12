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
	         
	         int k = sc.nextInt();
	         
	         int[][] dp = new int[n+1][k+1];
	         
	         for(int i = 0; i<=n; i++){
	             dp[i][0] = 1;
	         }
	         
	         for(int i = 0 ; i<=k; i++){
	             dp[0][i] = 0;
	         }
	         
	         for(int i = 1; i<=n; i++){
	             for(int j = 1;j <=k; j++){
	                 if(arr[i-1] > j){
	                     dp[i][j] = dp[i-1][j];
	                 }
	                 else 
	                     dp[i][j] = dp[i-1][j] + dp[i][j-arr[i-1]];
	             }
	         }
	         
	         System.out.println(dp[n][k]);
	     }
	}
}
