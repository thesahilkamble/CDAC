import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    
		    int[] arr = new int[n];
		    
		    for(int i= 0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    int neg = 0;
		    int pos = 0;
		    
		    int i = 1;
		    int j = 0;
		    
		    while(i < arr.length && j < arr.length){
		        
		        while(pos < arr.length && arr[pos] < 0){
		            pos++;
		        }
		        
		        if(pos >= arr.length ){
		           break;
		        }
		        int temp = arr[pos];
		        arr[pos] = arr[j];
		        arr[j] = temp;
		        j+=2;
		        pos++;
		        
		        
		        while(neg < arr.length && arr[neg] >= 0){
		            neg++;
		        }
		        
		        if(neg >= arr.length ){
		           break;
		        }
		         temp = arr[neg];
		        arr[neg] = arr[i];
		        arr[i] = temp;
		        i+=2;
		        neg++;
		    }
		    
		    for( i = 0 ; i<arr.length; i++)
		       System.out.print(arr[i]+" ");
		       
	    	System.out.println();
		   
		}
	}
}
