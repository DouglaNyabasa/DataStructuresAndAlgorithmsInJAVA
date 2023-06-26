package GraphBasedDataStructureAndAlgos.DepthFirstSearch;

import java.util.ArrayList;
import java.util.Stack;

//Depth-First Search is an algorithm for traversing or searching tree or graph data structures. One starts at the root
//and explores as far as possible along each branch before backtracking.
public class GraphSearch {
    int V;
    ArrayList<Integer>[] adjacency;
    GraphSearch(int noOfVertex){
        V=noOfVertex;
        adjacency=new ArrayList[noOfVertex];
        for (int i =0; i<noOfVertex;i++){
            adjacency[i]= new ArrayList<>();

        }
    }
    void edge(int x , int y){
        adjacency[x].add(y);
    }
    void depthFirstSearch(int sourceVertex){
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(sourceVertex);
        int node;
        while (!stack.isEmpty()){
            sourceVertex = stack.peek();
            stack.pop();

        for (int i=0;i<adjacency[sourceVertex].size();i++){
            node= adjacency[sourceVertex].get(i);
            if (!visited[node]){
                stack.push(node);
            }
        }
        if (visited[sourceVertex]== false){
            System.out.print(sourceVertex+ " ");
            visited[sourceVertex]= true;
        }}
    }
    public static void main(String[] args) {
        GraphSearch graphSearch = new GraphSearch(6);
        graphSearch.edge(0,1);
        graphSearch.edge(0,2);
        graphSearch.edge(1,0);
        graphSearch.edge(1,2);
        graphSearch.edge(2,1);
        graphSearch.edge(2,0);
        graphSearch.edge(2,3);
        graphSearch.edge(2,4);
        graphSearch.edge(3,2);
        graphSearch.edge(4,2);
        graphSearch.edge(4,5);
        graphSearch.edge(5,0);
        graphSearch.edge(5,4);
        graphSearch.depthFirstSearch(0);
    }
}
