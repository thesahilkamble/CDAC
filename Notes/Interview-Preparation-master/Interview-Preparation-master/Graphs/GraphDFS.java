import java.util.*;

class GraphDFS {
	private int v;
	private LinkedList<Integer> adj[];
	
	GraphDFS(int v){
	    this.v = v;
	    adj = new LinkedList[v];
	    for(int i = 0; i<v; i++){
	        adj[i] = new LinkedList();
	    }
	}
	
	void addEdge(int u, int v){
	    adj[u].add(v);
	}
	
	void dfs(int i){
	    boolean visited[] = new boolean[v];
	    dfsUtil(i,visited);
	}
	
	void dfsUtil(int n, boolean visited[]){
	    visited[n] = true;
	    System.out.println(n+" ");
	    
	    /* 
	     *Iterator<Integer> i = adj[n].listIterator();
	     *while(i.hasNext()){
	     *   int p = i.next();
	     *   if(!visited[p])
	     *      dfsUtil(p, visited)
	     *}
	     */
	     
	    for(int i : adj[n]){
	        if(!visited[i])
	            dfsUtil(i, visited);
	    }
	}
	
	public static void main(String[] args){
	    GraphDFS g = new GraphDFS(7);
	    g.addEdge(0,1);
	    g.addEdge(1,5);
	    g.addEdge(1,2);
	    g.addEdge(1,3);
	    g.addEdge(2,4);
	    g.addEdge(3,4);
	    g.addEdge(5,6);
	    
	    g.dfs(0);
	}
}
