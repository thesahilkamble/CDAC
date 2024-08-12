import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static int findWays(int m , int n){
        if(n == 1 || m == 1){
            return 1;
        }
        
        return findWays(m-1, n) + findWays(m, n-1);
    }
    
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     
	     while(t-- > 0){
	         int m = sc.nextInt();
	         int n = sc.nextInt();
	         
	         System.out.println(findWays(m,n));
	         
	     }
	}
}
