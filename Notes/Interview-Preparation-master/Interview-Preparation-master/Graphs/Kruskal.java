import java.util.*;

class Edge implements Comparable<Edge> {
  int u;
  int v;
  int w;
  
  Edge(int u, int v, int w) {
    this.u = u;
    this.v = v;
    this.w = w;
  } 
  
  public int compareTo(Edge edge) {

		int edgeWeight = ((Edge) edge).w;

		//ascending order
		return this.w - edgeWeight;
	}
}

class Solution {
  
    public static int findParent(int u, int[] parent){
      if(parent[u] == u){
        return u;
      }
      
      int currParent = parent[u];
      int index = u;
      while(currParent != index){
        index = currParent;
        currParent = parent[index];
      }
      return currParent;
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
      
        Edge[] inputEdges = new Edge[E];
        Edge[] mstEdges = new Edge[V-1];
        int[] parent = new int[V];
      
        for(int i= 0; i<V; i++)
          parent[i] = i;

		for(int i = 0; i<E; i++){
          int u = s.nextInt();
          int v = s.nextInt();
          int e = s.nextInt();
          
          inputEdges[i] = new Edge(u, v, e);
        }
        
        Arrays.sort(inputEdges);
        int count = 0;
        
        for(int i = 0; i<inputEdges.length; i++){
          Edge e = inputEdges[i];
          int x = findParent(e.u, parent);
          int y = findParent(e.v, parent);
         // System.out.println(x+ " " + y);
          if(x != y){
            mstEdges[count++] = e;
            parent[e.u] = y;
          }
          if(count == V-1)
            break;
        }
      
        for(int i = 0; i<mstEdges.length; i++){
          System.out.println(mstEdges[i].u + " " + mstEdges[i].v + " " + mstEdges[i].w);
        }
        
	}
}
