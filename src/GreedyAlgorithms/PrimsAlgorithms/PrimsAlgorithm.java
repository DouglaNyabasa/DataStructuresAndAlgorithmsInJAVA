package GreedyAlgorithms.PrimsAlgorithms;

import java.util.Arrays;

//Prim's Algorithm Application

// 1) Laying cables of electrical wiring
// 2)In network designed
// 3)To make protocols in network cycles
public class PrimsAlgorithm {


    public void Prim(int G[][],int nNodes){
        int INF =  9999999;
        int edgeNo ;
        boolean[] Visited = new boolean[nNodes];
        Arrays.fill(Visited,false);
        edgeNo=0;
        Visited[0]=true;

        while (edgeNo < nNodes-1){
            int min = INF;
            int x = 0;
            int y =0;

            for (int i=0;i<nNodes;i++){
                if (Visited[i]==true){
                    for (int j =0;j < nNodes;j++){
                        if (!Visited[j] && G[i][j] !=0){
                            if (min>G[i][j]){
                                x=i;
                                y=j;
                            }
                        }
                    }
                }
            }
            System.out.println(x + " - " + y + " :  " + G[x][y]);
            Visited[y]=true;
            edgeNo++;
        }
    }

    public static void main(String[] args) {
        PrimsAlgorithm primsAlgorithm = new PrimsAlgorithm();
        int nNode = 5;
        int[][] G = { { 0, 9, 75, 0, 0 }, { 9, 0, 95, 19, 42 }, { 75, 95, 0, 51, 66 }, { 0, 19, 51, 0, 31 }, { 0, 42, 66, 31, 0 } };
        primsAlgorithm.Prim(G,nNode);
    }




}
