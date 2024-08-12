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
		    boolean[] temp = new boolean[n];
		    for(int i = 0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    int max = arr[n-1];
		    temp[n-1] = true;
		    
		    for(int i = n-2; i>=0; i--){
		        if(max < arr[i]){
		            max = arr[i];
		            
		            temp[i] = true;
		            
		        }
		    }
		    
		    for(int i = 0; i<n; i++){
		        if(temp[i]){
		            System.out.print(arr[i]+" ");
		        }
		    }
		    
		    System.out.println();
		}
	}
}
