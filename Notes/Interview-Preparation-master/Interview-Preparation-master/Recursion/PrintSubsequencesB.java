/*package whatever //do not write package name here */

import java.io.*;

class PrintSubsequencesB {
    
    public static String[] printSubsequences(String s){
        
        if(s.length() == 0){
            String[] res = new String[1];
            res[0] = "";
            return res;
        }
        
        String[] smallRes = printSubsequences(s.substring(1));
        
        char c = s.charAt(0);
        
        String[] res = new String[2*smallRes.length];
        
        for(int i = 0; i<smallRes.length; i++){
            res[i] = smallRes[i];
        }
        
        for(int i = 0; i<smallRes.length; i++){
            res[i+smallRes.length] = c + smallRes[i];
        }
        
        return res;
    }
	public static void main (String[] args) {
		String s = "abcd";
		
		String[] res = printSubsequences(s);
		
		for(int i = 0; i<res.length; i++){
		    System.out.println(res[i]);
		}
	}
}
