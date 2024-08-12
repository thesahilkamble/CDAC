class LongestCommonSubsequence{
  
  public static int commonLength(String str1, String str2){
		
		int n = str1.length() + 1;
		int m = str2.length() + 1;
		int[][] dp = new int[n][m];
		
		for(int i = 1; i<n; i++) {
			for(int j = 1; j<m; j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
	    
		return dp[n-1][m-1];
	}
}
