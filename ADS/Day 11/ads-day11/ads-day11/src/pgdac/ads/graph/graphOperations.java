package pgdac.ads.graph;

public class graphOperations {

	public static void addEdgesToGraph(Graph g) {
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
	}

	public static void main(String[] args) {
		//Graph g = new AdjMatGraph(4, false);
		Graph g = new AdjListGraph(4, false);
		
		addEdgesToGraph(g);
		
		System.out.println("BFS ...");
		g.printBFS(0);

		System.out.println("DFS ...");
		g.printDFS(0);
	}

}
