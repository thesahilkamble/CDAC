import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     
	     while(t-- > 0){
	         int n = sc.nextInt();
	         int w = sc.nextInt();
	         
	         int[] cost = new int[n];
	         int[] weight = new int[n];
	         double[] ratio = new double[n];
	         
	         int k = 0;
	         for(int i = 0; i<2*n; i++){
	             if(i%2 == 0)
	                cost[k] = sc.nextInt();
	             else
	                weight[k++] = sc.nextInt();
	         }
	         
	         for(int i = 0; i<n; i++){
	             ratio[i] = (1.0 * cost[i]) / weight[i];
	         }
	         
	         for(int i = 0 ;i<n; i++){
	             for(int j = i+1; j<n; j++){
	                 if(ratio[i] < ratio[j]){
	                     double temp = ratio[i];
	                     ratio[i] = ratio[j];
	                     ratio[j] = temp;
	                     
	                     int t1 = cost[i];
	                     cost[i] = cost[j];
	                     cost[j] = t1;
	                     
	                     t1 = weight[i];
	                     weight[i] = weight[j];
	                     weight[j] = t1;
	                 }
	             }
	         }
	         
	         double finalCost = 0;
	         int i = 0;
	        
	         while(w > 0 && i < n){
	             
	             w -= weight[i];
	             
	             if(w == 0){
	                 finalCost += cost[i];
	                 break;
	             }
	             else if(w < 0){
	                 w += weight[i];
	                 finalCost += (w * ratio[i]);
	                 break;
	             }else{
	                 finalCost += cost[i];
	             }
	             i++;
	            // System.out.println(finalCost);
	         }
	         System.out.println(Math.round(finalCost*100)/100.0);
	         
	     }
	}
}
