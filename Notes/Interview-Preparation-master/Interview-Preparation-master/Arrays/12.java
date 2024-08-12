import java.util.*;
public class Solution {

	public static boolean containsConsecutiveNumbers(int[] input){
      
      HashSet<Integer> h = new HashSet<>();
      
      int min = Integer.MAX_VALUE;
      for(int i = 0; i<input.length; i++){
        if(input[i] < min){
          min = input[i];
        }
        h.add(input[i]);
      }
      
      for(int i = min; i<min + input.length; i++){
        if(!h.contains(i))
          return false;
        else{
          h.remove(i);
        }
      }
      
      return true;

	}
	
}
