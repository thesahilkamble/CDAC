import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     
	     while(t-- > 0){
	         
	         String s = sc.next();
	         
	         int[][] dp = new int[s.length()][s.length()];
	         
	         for(int i = 0; i<s.length(); i++){
	              dp[i][i] = 1;
	         }       
	        
	         for(int i = 0; i<s.length() - 1; i++){
	             if(s.charAt(i) == s.charAt(i+1)){
	                 dp[i][i+1] = 2;
	             }else
	             {
	                 dp[i][i+1] = Math.max(dp[i][i],dp[i+1][i+1]);
	             }
	         }
	         
	         // K is length of substring 
	         for(int k = 3; k<=s.length(); k++){
	             for(int i = 0; i<s.length() - k + 1; i++){
	                 int j = i + k - 1;
	                 
	                 int max = Math.max(dp[i][j-1],dp[i+1][j]);
	                 
	                 if(s.charAt(i) == s.charAt(j)){
	                     dp[i][j] = Math.max(dp[i+1][j-1]+2,max);
	                 }else{
	                     dp[i][j] = max;
	                 }
	                 
	             }
	         }
	         
	         System.out.println(dp[0][s.length()-1]);
	     }
	}
}
