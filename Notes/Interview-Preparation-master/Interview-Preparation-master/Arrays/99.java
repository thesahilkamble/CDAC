//  ELEMENT OCCURING ODD NUMBER OF TIMES
// TIME COMPLEXITY O(n)
// SPACE COMPLEXITY O(1)

import java.util.*;

class GFG {
	public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		
		for(int i = 0; i< n; i++)
		{
		    int temp = sc.nextInt();
		    res = res ^ temp;
		}
		
		System.out.println(res);
		
	}
}
   
   
