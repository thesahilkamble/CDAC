import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     
	     while(t-- > 0){
	         int m = sc.nextInt();
	         int n = sc.nextInt();
	         
	         int[][] dp = new int[m][n];
	         
	         for(int i = 0; i<m; i++)
	            dp[i][0] = 1;
	         
	         for(int i = 0; i<n; i++)
	            dp[0][i] = 1;
	         
	         for(int i = 1; i<m; i++){
	             for(int j = 1; j<n; j++){
	                 dp[i][j] = (dp[i-1][j]%1000000007 + dp[i][j-1]%1000000007)%1000000007;
	             }
	         }
	         
	         System.out.println(dp[m-1][n-1]);
	         
	     }
	}
}
