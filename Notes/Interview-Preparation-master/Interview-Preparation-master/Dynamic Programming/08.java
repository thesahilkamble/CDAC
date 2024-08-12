import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     
	     while(t-- > 0){
	         int n = sc.nextInt();
	         int w = sc.nextInt();
	         
	         int[] value = new int[n];
	         int[] weight = new int[n];
	         
	         
	         for(int i = 0; i<n; i++){
	             value[i] = sc.nextInt();
	         }
	         
	         for(int i = 0; i<n; i++){
	             weight[i] = sc.nextInt();
	         }
	         
	         int[][] dp = new int[n+1][w+1];
	         
	         for(int i = 1; i<=n; i++){
	             for(int j = 1; j<=w; j++ ){
	                 
	                 if(weight[i-1] <= j){
	                     dp[i][j] = Math.max(value[i-1] + dp[i-1][j - weight[i-1]], dp[i-1][j]);
	                 }
	                 else{
	                     dp[i][j] = dp[i-1][j];
	                 }
	             }
	         }
	         
	         System.out.println(dp[n][w]);
	         
	     }
	}
}
