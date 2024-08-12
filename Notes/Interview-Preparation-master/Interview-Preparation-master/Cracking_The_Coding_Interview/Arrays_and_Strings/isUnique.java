import java.util.*;

class IsUnique {
    
    public static boolean isUnique(String s){
        
        if(s.length() > 256)
             return false;
             
        boolean[] arr = new boolean[256];
        
        for(int i = 0; i<s.length(); i++){
            int index = s.charAt(i);
            
            if(arr[index])
               return false;
            
            arr[index] = true;
        }
        return true;
    }
    
   	public static void main (String[] args){
   	    
   	    String s = "qwertyuiop[asdfghjkl;zx,c.vbn.";
   	    
   	    System.out.println(isUnique(s));
	}
}
