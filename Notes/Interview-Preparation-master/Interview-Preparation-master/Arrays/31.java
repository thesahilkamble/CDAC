// ************** MAJORITY ELEMENT **************

// TIME COMPLEXITY = O(n)
// SPACE COMPLEXITY = O(n)

import java.util.*;

class GFG {
	public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i< n; i++)
		   a[i] = sc.nextInt();
		
		// Hashmap for counting frequency of each number
		HashMap<Integer, Integer> hm = new HashMap<>(); 
		
		// Stores key which has majority
		int ansKey = 0; 
		
		// flag is True if we find majority element
		boolean flag = false;
		
		
		for(int i = 0; i<n ; i++)
		{
		    if(!hm.containsKey(a[i]))
		    {
		        hm.put(a[i], 1);
		    }
		    else
		    {
		        int count = hm.get(a[i]);
		        hm.put(a[i], count+1 );
		        
		        if(count + 1 > n/2)
		        {
		            flag = true;
		            ansKey = a[i];
		        }
		    }
		}
		
		if(flag)
		   System.out.println(ansKey);
		else 
		   System.out.println("None");
		
	}
}
   
   
