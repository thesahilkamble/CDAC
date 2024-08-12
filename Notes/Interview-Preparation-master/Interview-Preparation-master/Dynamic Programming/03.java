import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static int maxSumIncreasingSubsequence(int[] arr){
		int[] dp = new int[arr.length];
		
		for(int i = 0; i<dp.length; i++)
			dp[i] = arr[i];
		
		for(int i = 1; i<arr.length; i++) {
			int j = 0;
			while(j < i) {
				if(arr[j] < arr[i]) {
					dp[i] = Math.max(dp[j] + arr[i], dp[i]);
				}
				j++;
			}
		}
		
		int max = 0;
		
		for(int i = 0; i<dp.length; i++) {
			if(max < dp[i])
				max =  dp[i];
		}
		
		return max;
	}
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    
		    int[] arr = new int[n];
		    for(int i= 0; i<n; i++)
		      arr[i] = sc.nextInt();
		      
		   System.out.println(maxSumIncreasingSubsequence(arr));	    
		    
		}
	}
}
