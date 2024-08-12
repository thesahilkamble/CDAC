package com.grv.randomPractice;
import java.util.*;

public class Practice {
	
	public static void swap(char[] str, int i, int j) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}
	
	public static void permutation(char[] str, int start, int end){
		
		if(start == end) {
			String s = new String(str);
			System.out.println(str);
		}
		else {
			for(int i = start; i<=end; i++) {
				swap(str, start, i);
				permutation(str, start + 1, end);
				swap(str, start, i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		String s = "ABCD";
		permutation(s.toCharArray(), 0 , s.length()-1);
	}
}
