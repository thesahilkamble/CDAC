import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static int count(int[] arr, int n, int k){
        
        if(k == 0)
           return 1;
        
        if(k < 0)
           return 0;
           
        if(n <= 0)
           return 0;
           
        return count(arr, n-1, k) + count(arr, n, k - arr[n-1])   ;
    }
    
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
	         
	         System.out.println(count(arr, n, k));
	         
	         
	     }
	}
}
