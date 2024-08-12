import java.util.*;

class GraphMatrixDFS {
	private int v;
	private int adj[][];
	
	GraphMatrixDFS(int v){
	    this.v = v;
	    adj = new int[v][v];
	}
	
	void addEdge(int u, int v){
	    adj[u][v] = 1;;
	}
	
	void dfs(int s){
	    boolean visited[] = new boolean[v];
	    visited[s] = true;
	    dfs(s, visited);
	}
	
	void dfs(int i, boolean[] visited){
	    
	    System.out.println(i+" ");
	    
	    for(int j = 0; j<v; j++){
	        if(adj[i][j] == 1 && !visited[j]){
	            visited[j] = true;
	            dfs(j, visited);
	        }
	    }
	}
	
	
	public static void main(String[] args){
	    GraphMatrixDFS g = new GraphMatrixDFS(7);
	    g.addEdge(0,1);
	    g.addEdge(1,5);
	    g.addEdge(1,2);
	    g.addEdge(2,4);
	    g.addEdge(4,3);
	    g.addEdge(5,6);
	    
	    g.dfs(0);
	}
}
