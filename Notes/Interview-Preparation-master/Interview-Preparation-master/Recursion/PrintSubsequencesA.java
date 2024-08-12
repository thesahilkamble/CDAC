class PrintSubsequencesA {
    
    public static void printSubsequences(String s, String res, int index){
        
        if(index == s.length()){
            System.out.println(res);
            return;
        }
        
        for(int i = index; i < s.length(); i++){
            printSubsequences(s, res + s.charAt(i), i + 1);
        }
        
    }
	public static void main (String[] args) {
		String s = "abc";
		
		printSubsequences(s, "", 0);
	}
}
