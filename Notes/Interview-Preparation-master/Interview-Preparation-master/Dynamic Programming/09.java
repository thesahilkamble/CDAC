import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     
	     while(t-- > 0){
	         int n = sc.nextInt();
	         int m = sc.nextInt();
	         
	         String s1 = sc.next();
	         String s2 = sc.next();
	         
	         int[][] dp = new int[n+1][m+1];
	         
	         for(int i = 0; i<=n; i++){
	             for(int j = 0; j<=m; j++){
	                 
	                 if(i == 0){
	                     dp[i][j] = j;
	                 }
	                 else if(j == 0){
	                     dp[i][j] = i;
	                 }
	                 else{
	                     
	                     if(s1.charAt(i-1) == s2.charAt(j-1)){
	                         dp[i][j] = dp[i-1][j-1];
	                     }
	                     else{
	                         dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1])) + 1;
	                     }
	                 }
	             }
	         }
	         
	         System.out.println(dp[n][m]);
	         
	     }
	}
}
