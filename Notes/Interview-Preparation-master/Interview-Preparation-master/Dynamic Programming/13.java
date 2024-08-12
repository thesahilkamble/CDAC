import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     
	     while(t-- > 0){
	         int n = sc.nextInt();
	         int k = sc.nextInt();
	         
	         if(n == 1)
	            System.out.println(k);
	         else{
    	         long diff = k * (k-1);
    	         long same = k;
    	         
    	         for(int i = 3; i<=n; i++){
    	             
    	             long pDiff = diff;
    	             diff =  ((pDiff%1000000007 + same%1000000007)%1000000007 * (k-1)%1000000007)%1000000007;
    	             same = pDiff;
    	         }
    	         
    	         System.out.println((same + diff)%1000000007);
	         }      
	     }
	}
}
