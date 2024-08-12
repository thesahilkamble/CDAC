import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static String checkAnagram(String s1, String s2){
        
        if(s1.length() != s2.length())
           return "NO";
        else
        {
            int[] freq = new int[256];
            
            for(int i= 0; i<s1.length(); i++){
                freq[(int)s1.charAt(i)]+=1;
            }
            
            for(int i= 0; i<s2.length(); i++){
                freq[(int)s2.charAt(i)]-=1;
            }
            
            for(int i = 0; i<freq.length; i++){
                if(freq[i] != 0){
                    return "NO";
                }
            }
            return "YES";
        }
        
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		   String s1 = sc.next();
		   String s2 = sc.next();
		   
		   System.out.println(checkAnagram(s1, s2));
	   }
	}
}
