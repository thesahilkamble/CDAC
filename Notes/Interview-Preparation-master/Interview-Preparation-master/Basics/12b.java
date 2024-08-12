package com.grv.randomPractice;
import java.util.*;

public class Practice {
	public static int pow(int x , int n) {
		
		if(n == 0)
			return 1;
		
		int y = pow(x, n/2);
		if(n%2 == 0) {
			return y * y;
		}
		else {
			return x * y * y;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(pow(2,9));
	}
}
