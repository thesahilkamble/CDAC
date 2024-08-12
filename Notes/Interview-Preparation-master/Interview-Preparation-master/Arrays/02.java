import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int equilibiriumIndex(int[] arr){
		
		int sum = 0;
		for(int i = 0; i<arr.length; i++)
			sum+= arr[i];
		
		int leftSum = 0;
		int rightSum = sum;
		
		for(int i = 0; i<arr.length; i++) {
			rightSum-= arr[i];
			
			if(leftSum == rightSum)
				return i+1;
			
			leftSum+= arr[i];
		}
		
		return -1;
	}
    
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    
		    for(int i = 0; i<n; i++)
		       arr[i] = sc.nextInt();
		       
		    
		    System.out.println(equilibiriumIndex(arr));
		    
		}
	}
}
