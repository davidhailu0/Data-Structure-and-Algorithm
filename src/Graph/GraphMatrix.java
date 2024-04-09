package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class GraphMatrix {
    int current;
    ArrayList<Node> nodesList;
    int[][] matrix;
    public GraphMatrix(int size){
        current = 0;
        matrix = new int[size][size];
        nodesList = new ArrayList<>();
    }
    public void addNode(Node node){
        node.setIndex(current);
        nodesList.add(node);
        current++;
    }
    public void addEdge(Node node1,Node node2){
        if(node1.index==-1){
            node1.setIndex(current);
            nodesList.add(node1);
            current++;
        }
        if(node2.index==-1){
            node2.setIndex(current);
            nodesList.add(node2);
            current++;
        }
        matrix[node1.index][node2.index] = 1;
    }
    public boolean checkEdge(Node node1,Node node2){
        return matrix[node1.index][node2.index] == 1;
    }

    void printMatrix(){
        System.out.print("  ");
        for(Node node:nodesList){
            System.out.print(node.data+" ");
        }
        System.out.println();
        for(int j=0;j<current;j++){
            System.out.print(nodesList.get(j).data+" ");
            for(int k=0;k<current;k++){
                System.out.print(matrix[j][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void depthFirstSearch(Node node){
        dfsHelper(node);
    }

    public void breadthFirstSearch(Node node){
        int nodeIndex;
        Queue<Node> queue = new LinkedList<>();
        node.visited = true;
        queue.offer(node);
        while(!queue.isEmpty()){
            nodeIndex  = queue.poll().index;
            System.out.println("Visited Node: "+nodesList.get(nodeIndex).data);
            for(int i=0;i<matrix[nodeIndex].length;i++){
                if(matrix[nodeIndex][i]==1&&!nodesList.get(i).visited){
                    nodesList.get(i).visited = true;
                    queue.offer(nodesList.get(i));
                }
            }
        }
    }

    private void dfsHelper(Node node){
        if(node.visited){
            return;
        }
        node.visited = true;
        System.out.println("Visited Node: "+node.data);
        for(int i=0;i<matrix[node.index].length;i++){
            if(matrix[node.index][i]==1){
                dfsHelper(nodesList.get(i));
            }
        }
    }
}
