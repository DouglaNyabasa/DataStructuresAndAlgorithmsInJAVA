import java.util.ArrayList;
import java.util.Iterator;

public class GraphSearch {
    int V;
    ArrayList<Integer> adjacency[];
    GraphSearch(int noOfVertex){
        V=noOfVertex;
        adjacency = new ArrayList[noOfVertex];
        for (int i=0;i<noOfVertex;i++){
            adjacency[i] = new ArrayList<>();
        }
    }
    void breathFirstSearch(int sourcevertex){
        boolean[] visited = new boolean[V];
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        visited[sourcevertex] = true;
        a1.add(sourcevertex);
        while (!a1.isEmpty()){
            sourcevertex = a1.remove(0);
            System.out.println(sourcevertex + " ");
            Iterator iterator = adjacency[sourcevertex].iterator();
            while (iterator.hasNext()){
                int n = (int) iterator.next();
                if (!visited[n]){
                    visited[n]=true;
                    a1.add(n);
                }
            }
        }
    }
    void edge(int x,int y){
        adjacency[x].add(y);
    }
    public static void main(String[] args) {
        GraphSearch graphSearch = new GraphSearch(6);
        graphSearch.edge(0,1);
        graphSearch.edge(0,2);
        graphSearch.edge(0,5);
        graphSearch.edge(0,0);
        graphSearch.edge(0,0);
        graphSearch.edge(0,0);
        graphSearch.edge(0,0);
        graphSearch.edge(0,0);
        graphSearch.edge(0,0);
    }
}
