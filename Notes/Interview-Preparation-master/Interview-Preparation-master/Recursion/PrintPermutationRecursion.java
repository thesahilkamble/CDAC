/*package whatever //do not write package name here */

import java.io.*;

class PrintPermutationA {
    
    public static void printPermutation(String s, String res){
        if(s.length() == 0){
            System.out.println(res);
            return;
        }
        
        for(int i = 0; i<s.length(); i++){
            printPermutation(s.substring(0,i)+s.substring(i+1), res + s.charAt(i));
        }
    }
	public static void main (String[] args) {
		String s = "abc";
		
		printPermutation(s,"");
	}
}
