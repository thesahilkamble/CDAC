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
		    
		    for(int i = 0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    int subarrayLength = Integer.MAX_VALUE;
		    int start = 0;
		    int end = 0;
		    
		    int currSum = 0;
		    
		    while(end < arr.length){
		        
		        while(currSum <= k && end < arr.length)
		            currSum+= arr[end++];
		            
		        while(currSum > k && start < arr.length){
		            
		            if(subarrayLength > end - start )
		                subarrayLength = end - start ;
		            
		            currSum -= arr[start++];
		        }      
		    }
		    
		    System.out.println(subarrayLength);
		    
		    
		} 
	}
}
