import java.util.*;

/* INPUT
 * 4 2   // no. of nodes & no of edges
 * 0 1   // Edge u to v
 * 2 3   // Edge u to v
 */
public class Solution {
  
    int[][] adj;
    int v;
    static boolean[] visited;  
  
    static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
   
 
  	Solution(int v){
      this.v = v;
      adj = new int[v][v];
      visited = new boolean[v];
    }
  
    public void addEdge(int u, int v){
      adj[u][v] = 1;
      adj[v][u] = 1;
    }
  
    public boolean bfs(int source, int index){
      Queue<Integer> q = new LinkedList<Integer>();
      q.add(source);
      visited[source] = true;
      res.get(index).add(source);
      
      while(!q.isEmpty()){
        int curr = q.remove();
        
        
        for(int i = 0; i<v; i++){
          if(adj[curr][i] == 1 && !visited[i]){
            q.add(i);
            visited[i] = true;
             res.get(index).add(i);
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
        
        int count = 0;
        for(int i = 0; i<visited.length; i++){
          if(!visited[i]){
            res.add(new ArrayList<Integer>());
            g.bfs(i, count);
            count++;
          }
        }
        
        for(int i = 0; i<res.size(); i++){
            ArrayList<Integer> temp = res.get(i);
            Collections.sort(temp);
            for(int k : temp)
               System.out.print(k+" ");
            System.out.println();
        }
	}
}
