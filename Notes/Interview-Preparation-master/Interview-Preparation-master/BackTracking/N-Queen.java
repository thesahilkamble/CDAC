
public class Solution {
  
  public static int[][] board = new int[11][11];
  
public static boolean isPossible(int row, int col, int n){
  
  // for checking above row in same column
  for(int j = row; j>=0; j--){
    if(board[j][col] == 1)
      return false;
  }
  
  // for left diagonal
  for(int i = row, j = col; i>=0 && j>=0 ; i--, j--){
    if(board[i][j] == 1){
      return false;
    }
  }
  
  // for right diagonal
  for(int i = row, j = col; i>=0 && j<n; i--,j++){
    if(board[i][j] == 1){
      return false;
    }
  }
  
  return true;
  
}  

public static void findboard(int row, int n){
  
     if(row == n){
       for(int i = 0; i<n; i++){
         for(int j = 0; j<n; j++){
           System.out.print(board[i][j]+" ");
         }
         System.out.println();
       }
       System.out.println();
       return;
     }
  
     for(int j = 0 ; j < n; j++){
       if(isPossible(row,j,n)){
         board[row][j] = 1;
         findboard(row+1,n);
         board[row][j] = 0;
       }
     }

}
  
		
public static void placeNQueens(int n){
		
        findboard( 0, n);
  
        for(int i = 0; i<11; i++){
          for(int j = 0; j<11; j++){
            board[i][j] = 0;
          }
        }
	
	}
	
	public static void main(String args[]){
	    
	    placeNQueens(5);
	}
	
}
