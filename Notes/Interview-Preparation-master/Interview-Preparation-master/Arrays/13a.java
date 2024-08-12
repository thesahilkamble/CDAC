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
		    int start = -1;
		    int end = -1;
		    
		    for(int i = 0 ; i<n; i++){
		        
		        int sum = arr[i];
		        if(sum > k){
		            start = i + 1;
		            end = i + 1;
		            subarrayLength = 1;
		            break;
		        }
		        
		        for(int j = i + 1; j<n; j++){
		            sum += arr[j];
		            int tempLength = j - i + 1;
		            
		            if(sum > k && tempLength < subarrayLength){
		                start = i + 1;
		                end = j + 1;
		                subarrayLength = tempLength;
		                break;
		            }
		        }
		    }
		    
		    System.out.println(subarrayLength);
		    
		    
		} 
	}
}
