package learn.datastructure.graph;


// Unidirectional Graph

public class AdjencyMatrixGraph {
	
	boolean adjMatrix[][];
	int vertexCount;
	
	// Constructor
	public AdjencyMatrixGraph(int vertexCount){
		this.vertexCount = vertexCount;
		adjMatrix = new boolean[vertexCount][vertexCount];
	}
	
	//Add an Edge
	public void addEdge(int i, int j){
		if(i >= 0 && i < vertexCount && j >= 0 && j < vertexCount){
			adjMatrix[i][j] = true;
		}
	}
	
	//Remove an Edge
	public void removeEdge(int i, int j){
		if(i >= 0 && i<vertexCount && j>= 0 && j< vertexCount){
			adjMatrix[i][j] = false;
		}
	}
	
	// Is Edge present
	public boolean isEdge(int i, int j){
		if(i >= 0 && i<vertexCount && j>= 0 && j< vertexCount){
			return adjMatrix[i][j];
		}else{
			return false;
		}
	}
	
	public void printGraph(){
		for(int i = 0 ; i<vertexCount ; i++){
			for(int j = 0 ; j<vertexCount ; j++){
				System.out.print(isEdge(i,j));
				System.out.print("\t");
				
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		System.out.println("Starting the program.");
		AdjencyMatrixGraph adjencyMatrixGraph = new AdjencyMatrixGraph(4);
		
		adjencyMatrixGraph.addEdge(0,0);
		adjencyMatrixGraph.addEdge(0,1);
		adjencyMatrixGraph.addEdge(0,2);
		adjencyMatrixGraph.addEdge(0,3);
		

		adjencyMatrixGraph.addEdge(1,0);
		adjencyMatrixGraph.addEdge(1,1);
		adjencyMatrixGraph.addEdge(1,2);
		

		adjencyMatrixGraph.addEdge(2,0);
		adjencyMatrixGraph.addEdge(2,1);
		adjencyMatrixGraph.addEdge(2,2);
		adjencyMatrixGraph.addEdge(2,3);
		

		adjencyMatrixGraph.addEdge(3,0);
		adjencyMatrixGraph.addEdge(3,2);
		adjencyMatrixGraph.addEdge(3,3);
		
		
		adjencyMatrixGraph.printGraph();
		
		System.out.println("Program Ends.");
		
	}
}
