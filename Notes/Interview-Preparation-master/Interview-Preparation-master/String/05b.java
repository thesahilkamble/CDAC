package com.grv.randomPractice;
import java.util.*;

public class Practice {
	
	
	
	public static void permutation(String str, String res){
		
		if(str.length() == 0) {
			System.out.println(res);
			return;
		}
		
		for(int i = 0; i<str.length(); i++) {
			permutation(str.substring(0, i) + str.substring(i+1), res + str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		
		String s = "ABC";
		permutation(s,"");
	}
}
