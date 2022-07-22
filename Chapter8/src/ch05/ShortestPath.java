package ch05;

public class ShortestPath {

	public static void main(String[] args) {

		MyGraph graph = new MyGraph(6);
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 4);
		graph.addEdges(1, 2, 2);
		graph.addEdges(2, 3, 1);
		graph.addEdges(3, 4, 8);
		graph.addEdges(3, 5, 3);
		graph.addEdges(4, 5, 4);
		
		graph.calcShortPath(0);
		graph.showDistance(0);
		
	}

}
