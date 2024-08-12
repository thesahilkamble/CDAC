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
		    
		    for(int i = 0; i<n; i++){
		        int currSum = arr[i];
		        for(int j = i + 1; j<=n; j++){
		            if(currSum == k){
		                System.out.println(i+1+" "+(j));
		                found = true;
		                break;
		            }
		            if(currSum > k || j == n)
		               break;
		            currSum+= arr[j];
		        }
		        if(found)
		          break;
		    }
		    if(!found)
		       System.out.println("-1");
		}
	}
}
