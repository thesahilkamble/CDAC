import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static String checkBalancedParanthesis(String str){
        Stack<Character> s = new Stack<>();
        
        int i = 0;
        for(i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                s.push(str.charAt(i));
            }
            else if(c == '}' && !s.isEmpty() && s.peek() == '{'){
                s.pop();
            }
            else if(c == ']' && !s.isEmpty() && s.peek() == '['){
                s.pop();
            }
            else if(c == ')' && !s.isEmpty() && s.peek() == '('){
                s.pop();
            }
            else 
               return "not balanced";
        }
        if(i == str.length() && s.isEmpty())
            return "balanced";
        return "not balanced";
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    String str = sc.next();
		System.out.println(checkBalancedParanthesis(str));
	   }
	    
	}
}
