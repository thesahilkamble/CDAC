import java.util.*;

public class Solution {
  
    int[][] adj;
    int v;
    
    static HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
  
    Solution(int v){
      this.v = v;
      adj = new int[v][v];
    }
  
    public void addEdge(int u, int v){
      adj[u][v] = 1;
      adj[v][u] = 1;
    }
  
    public boolean bfs(int source, int dest){
      boolean[] visited = new boolean[v];
      Queue<Integer> q = new LinkedList<Integer>();
      q.add(source);
      visited[source] = true;
      
      while(!q.isEmpty()){
        int curr = q.remove();
        
        //System.out.print(curr+" ");
        
        for(int i = 0; i<v; i++){
          if(adj[curr][i] == 1 && !visited[i]){
         //   System.out.println("edge : "+source+ ": "+i);
            q.add(i);
            visited[i] = true;
            h.put(i, curr);
            if(i == dest){
              return true;
            }
          }
        }
      }
      return false;
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
      
        int source = s.nextInt();
        int dest = s.nextInt();
      
        if(!g.bfs(source, dest))
            return;
      
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        //System.out.println(h);
        
        
        int node = dest;
        while(node!=source){
          res.add(node);
          node = h.get(node);
        }
        res.add(source);
        
        for(int i = 0; i<res.size(); i++){
          System.out.print(res.get(i)+" ");
        }
	}
}
