import java.util.*;

public class Solution {
  
    int[][] adj;
    int v;
 
  	Solution(int v){
      this.v = v;
      adj = new int[v][v];
    }
  
    public void addEdge(int u, int v){
      adj[u][v] = 1;
      adj[v][u] = 1;
    }
  
    public boolean bfs(int source){
      boolean[] visited = new boolean[v];
      Queue<Integer> q = new LinkedList<Integer>();
      q.add(source);
      visited[source] = true;
      
      while(!q.isEmpty()){
        int curr = q.remove();
        
        for(int i = 0; i<v; i++){
          if(adj[curr][i] == 1 && !visited[i]){
            q.add(i);
            visited[i] = true;
            }
          }
        }
      
       for(int i = 0; i<visited.length; i++){
        if(!visited[i])
          return false;
       }
       return true;
      
      }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
      
        Solution g = new Solution(V);

		for(int i = 0; i<E; i++){
          int u = s.nextInt();
          int v = s.nextInt();
          g.addEdge(u,v);
        }
      
        System.out.println(g.bfs(0));
	}
}
