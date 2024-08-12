
public class Solution {
	
    public static boolean isSafe(int x, int y, int n, int m){
      if(x >=0 && x < m && y>= 0 && y < n){
        return true;
      }
      return false;
    }
	
    public static void findPath(int maze[][], int[][] path , int x, int y){
      int m = path.length;
      int n = path[0].length;
      
      if(!isSafe(x, y, n, m) || maze[x][y] == 0 || path[x][y] == 1)
        return;
        
      path[x][y] = 1;
      
      if(x == m-1 && y == n-1){
        for(int i = 0 ;i<m; i++){
          for(int j = 0; j<n; j++){
            System.out.print(path[i][j]+" ");
          }
          System.out.println();
        }
        System.out.println();
      }
      
      
      
      findPath(maze, path, x-1, y);
      findPath(maze, path, x+1, y);
      findPath(maze, path, x, y-1);
      findPath(maze, path, x, y+1);
      path[x][y] = 0;

    }
	
	public static void ratInAMaze(int maze[][]){
	  
      int m = maze.length;
      int n = maze[0].length;
	  int[][] path = new int[m][n];
      
      findPath(maze, path, 0 , 0);
      		
	}
	
	public static void main(String[] args){
	    int[][] maze = {{1,1,1},{1,0,1},{1,1,1}};
	    ratInAMaze(maze);
	}

}
