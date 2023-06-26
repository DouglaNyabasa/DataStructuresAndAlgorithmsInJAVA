package GraphBasedDataStructureAndAlgos.BreadthFirstSearch;

import java.util.ArrayList;
import java.util.Iterator;

// BreadthFirstSearch is an algorithm to trace nodes of a graph in a Breadth-First order
// that is the neighbour nodes in a single level are traversed first,
// then the next level will follow.
public class GraphSearch {

    int V;
    ArrayList<Integer> adjacency[];
    GraphSearch(int noOfvertex){
        V=noOfvertex;
        adjacency = new ArrayList[noOfvertex];
        for (int i=0; i<noOfvertex; i++){
            adjacency[i] = new ArrayList<>();
        }
    }
    void edge(int x, int y){
        adjacency[x].add(y);

    }
    void  breadthFirstSearch(int sourceVertex){
        boolean[] visited = new boolean[V];
        ArrayList<Integer> arrayList = new ArrayList<>();
        visited[sourceVertex]= true;
        arrayList.add(sourceVertex);
        while (!arrayList.isEmpty()){
            sourceVertex=arrayList.remove(0);
            System.out.print(sourceVertex+" ");
            Iterator i = adjacency[sourceVertex].iterator();
            while (i.hasNext()){
                int n = (int) i.next();
                if (!visited[n]){
                    visited[n]=true;
                    arrayList.add(n);

                }
            }
        }
    }
    public static void main(String[] args) {
        GraphSearch graphSearch = new GraphSearch(6);
        graphSearch.edge(0,1);
        graphSearch.edge(0,2);
        graphSearch.edge(0,5);
        graphSearch.edge(1,2);
        graphSearch.edge(2,0);
        graphSearch.edge(2,1);
        graphSearch.edge(2,3);
        graphSearch.edge(2,4);
        graphSearch.edge(3,2);
        graphSearch.edge(4,2);
        graphSearch.edge(4,5);
        graphSearch.edge(5,0);
        graphSearch.edge(5,4);
        graphSearch.breadthFirstSearch(0);

    }
}
