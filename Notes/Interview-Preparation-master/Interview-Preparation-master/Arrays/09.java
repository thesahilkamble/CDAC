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
	           
	           int[] arr = new int[n];
	           
	           HashSet<Integer> h = new HashSet<>();
	           
	           for(int i = 0; i<n ;i++){
	               arr[i] = sc.nextInt();
	               
	               if(!h.contains(arr[i]))
	                  h.add(arr[i]);
	           }
	           
	           boolean flag = false;
	           for(int i = 0; i<n; i++){
	               int diff = k - arr[i];
	               
	               if(h.contains(diff)){
	                   flag = true;
	                   System.out.println("Yes");
	                   break;
	               }
	           }
	           
	           if(!flag)
	              System.out.println("No");
	       }
	}
}
