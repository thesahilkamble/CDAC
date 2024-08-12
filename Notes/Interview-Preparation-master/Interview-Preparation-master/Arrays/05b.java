import java.util.*;

/* Given an unsorted array of non-negative integers, find a continuous sub-array which 
 * adds to a given number.
 */
 
 
class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    boolean found = false;
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int[] arr = new int[n];
		    
		    for(int i = 0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    int currSum = arr[0];
		    int start = 0;
		    int i;
		    
		    for(i = 1; i<=n; i++){
		        while(currSum > k && start < i - 1){
		            currSum -= arr[start];
		            start++;
		        }
		        
		        if(currSum == k){
		            System.out.println((start+1)+" "+(i));
		            found = true;
		            break;
		        }
		        
		        if(i < n)
		          currSum += arr[i];
		    }
		    if(!found)
		       System.out.println("-1");
		}
	}
}
