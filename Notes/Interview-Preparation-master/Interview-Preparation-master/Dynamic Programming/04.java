import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     
	     while(t-- > 0){
	         
	         String s = sc.next();
	         int start = 0;
	         int length = 1;
	         
	         boolean[][] dp = new boolean[s.length()][s.length()];
	         
	         for(int i = 0; i<s.length(); i++){
	              dp[i][i] = true;
	         }       
	        
	         for(int i = 0; i<s.length() - 1; i++){
	             if(s.charAt(i) == s.charAt(i+1)){
	                 dp[i][i+1] = true;
	                 if(start == 0){
	                     start = i;
	                 }
	                 length = 2;
	             }
	         }
	         
	         // K is length of substring 
	         for(int k = 3; k<=s.length(); k++){
	             for(int i = 0; i<s.length() - k + 1; i++){
	                 int j = i + k - 1;
	                 
	                 if(dp[i+1][j-1] && s.charAt(i) == s.charAt(j)){
	                         dp[i][j] = true;
	                         
	                         if(k > length){
	                             start = i; 
	                             length = k;
	                        }
	                 }
	                 
	             }
	         }
	         System.out.println(s.substring(start,start+length));
	         
	     }
	}
}
