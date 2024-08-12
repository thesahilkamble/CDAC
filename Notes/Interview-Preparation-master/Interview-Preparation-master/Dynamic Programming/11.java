import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     
	     while(t-- > 0){
	         int n = sc.nextInt();
	         int[] arr = {3,5,10};
	         
	         int dp[] = new int[n+1];
	         dp[0] = 1;
	         
	         for(int i = 0; i<arr.length; i++){
	             for(int j = arr[i]; j<=n; j++){
	                 dp[j] += dp[j - arr[i]];
	             }
	         }
	         
	         System.out.println(dp[n]);
	     }
	}
}
