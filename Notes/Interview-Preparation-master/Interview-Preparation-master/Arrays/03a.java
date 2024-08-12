//  LARGEST SUM COUNTIGOUS SUB ARRAY
// TIME COMPLEXITY O(n)
// SPACE COMPLEXITY O(1)

import java.util.*;

class GFG {
	public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int a[] = new int[n];
	    	
		for(int i = 0; i< n; i++)
		    a[i] = sc.nextInt();
	
	    int maxValue = 0;
	    int currSum = 0;
	    
	    for(int i = 0; i<n; i++)
	    {
	        currSum += a[i];
	        
	        if(currSum > maxValue)
	           maxValue = currSum;
	           
	        if(currSum < 0)
	           currSum = 0;
	   
	    }
	    
		
		System.out.println(maxValue);
		
	}
}
   
   
