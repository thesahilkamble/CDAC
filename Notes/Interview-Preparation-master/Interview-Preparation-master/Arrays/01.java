import java.util.*;

class GFG {
    
    
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int sum =  0;
		
		for(int i= 0; i<n-1; i++)
		{
		    a[i] = sc.nextInt();
		    sum+= a[i];
		}  
		
		System.out.println((n*(n+1))/2  - sum);
		
	}
}
   
   
