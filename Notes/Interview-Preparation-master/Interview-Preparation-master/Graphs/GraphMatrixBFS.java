import java.util.*;

class GraphMatrixBFS {
	private int v;
	private int adj[][];
	
	GraphMatrixBFS(int v){
	    this.v = v;
	    adj = new int[v][v];
	}
	
	void addEdge(int u, int v){
	    adj[u][v] = 1;;
	}
	
	void bfs(int s){
	    boolean visited[] = new boolean[v];
	    Queue<Integer> q = new LinkedList<Integer>();
	    
	    visited[s] = true;
	    q.add(s);
	    
	    while(!q.isEmpty()){
	        s = q.remove();
	        System.out.print(s+" ");
	        
	        for(int i = 0; i<v; i++){
	            if(adj[s][i] == 1 && !visited[i]){
	                visited[i] = true;
	                q.add(i);
	            }
	        }
	    }
	}
	
	
	public static void main(String[] args){
	    GraphMatrixBFS g = new GraphMatrixBFS(7);
	    g.addEdge(0,1);
	    g.addEdge(1,5);
	    g.addEdge(1,2);
	    g.addEdge(2,4);
	    g.addEdge(4,3);
	    g.addEdge(5,6);
	    
	    g.bfs(0);
	}
}
