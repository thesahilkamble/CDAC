/*package whatever //do not write package name here */

import java.io.*;

class PrintKeypad {
    
    public static String getString(int num){
        String[] res = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return res[num];
    }
    
    public static String[] printKey(int num){
        if(num/10 == 0){
            //System.out.println(num);
            String keyString = getString(num);
            String[] res = new String[keyString.length()];
            
            for(int i = 0; i<keyString.length(); i++){
                res[i] = keyString.charAt(i) + "";
            }
            return res;
        }
        
        String[] smallRes = printKey(num/10);
        
        int key = num%10;
        String keyString = getString(key);
        
        String[] res = new String[smallRes.length * keyString.length()];
        
        int k = 0;
        
        for(int i = 0; i<keyString.length(); i++){
            for(int j = 0; j<smallRes.length; j++){
                res[k++] =  smallRes[j] + keyString.charAt(i);
            }
        }
        return res;
    }
    
	public static void main (String[] args) {
		int num = 234;
		
		String[] res = printKey(num);
		for(int i = 0; i<res.length; i++){
		    System.out.println(res[i]);
		}
	}
}
