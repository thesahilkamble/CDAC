import java.util.*;

class GraphBFS {
	private int v;
	private LinkedList<Integer> adj[];
	
	GraphBFS(int v){
	    this.v = v;
	    adj = new LinkedList[v];
	    for(int i = 0; i<v; i++){
	        adj[i] = new LinkedList();
	    }
	}
	
	void addEdge(int u, int v){
	    adj[u].add(v);
	}
	
	void bfs(int s){
	    boolean visited[] = new boolean[v];
	    Queue<Integer> q = new LinkedList<Integer>();
	    
	    visited[s] = true;
	    q.add(s);
	    
	    while(!q.isEmpty()){
	        s = q.remove();
	        System.out.print(s+" ");
	        
	        for(int i : adj[s]){
	            if(!visited[i]){
	                visited[i] = true;
	                q.add(i);
	            }
	        }
	    }
	}
	
	
	public static void main(String[] args){
	    GraphBFS g = new GraphBFS(7);
	    g.addEdge(0,1);
	    g.addEdge(1,5);
	    g.addEdge(1,2);
	    g.addEdge(2,4);
	    g.addEdge(4,3);
	    g.addEdge(5,6);
	    
	    g.bfs(0);
	}
}
