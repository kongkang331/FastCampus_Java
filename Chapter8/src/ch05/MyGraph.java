package ch05;

public class MyGraph {

	private int count;				// node
	private int[][] vertexMatrix;	// matrix 그래프 표시 
	private int[] distance;			// 특정 노드에 대한 각 노드의 최단 거리 
	private boolean[] visited;		// 거쳐가는 노드 
	private static int UNLIMIT = 999999999;		// 초기값 
	
	public MyGraph(int count) {
		this.count = count;
		vertexMatrix = new int[count][count];
		distance = new int[count];
		visited = new boolean[count];
	}
	
	public void addEdges(int from, int to, int weight) {
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}
	
	public void calcShortPath(int from) {
		
		for (int i = 0 ; i < count ; i++) {
			distance[i] = UNLIMIT;
		}
		
		visited[from] = true;
		distance[from] = 0;
		// 연결노드 distance 갱신 
		for (int i = 0 ; i < count ; i++) {
			if ( visited[from] && vertexMatrix[from][i] != 0 ) {
				distance[i] = vertexMatrix[from][i];
			}
		}
		
		for (int k = 0 ; k < count - 1 ; k++) {
			int min = UNLIMIT;
			int minIndex = -1;
			
			for (int i = 0 ; i < count ; i++) {
				if ( !visited[i] && distance[i] != UNLIMIT ) {
					if ( distance[i] < min ) {
						min = distance[i];
						minIndex = i;
					}
				}
			}
			
			visited[minIndex] = true;
			for (int i = 0 ; i < count ; i++) {
				if ( !visited[i] && vertexMatrix[minIndex][i] != 0 ) {
					if ( distance[i] > distance[minIndex] + vertexMatrix[minIndex][i] ) {
						distance[i] = distance[minIndex] + vertexMatrix[minIndex][i];
					}
				}
			}
		}
		
	}
	
	public void showDistance(int from) {
		for (int i = 0 ; i < count ; i++) {
			System.out.println(from + "노드로부터 " + i + " 노드의 최단 거리는 : " + distance[i]);
		}
	}
		
}
