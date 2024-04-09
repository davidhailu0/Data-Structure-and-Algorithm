package Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphAdjacency {
    ArrayList<LinkedList<Node>> adjacencyList;
    public GraphAdjacency(){
        adjacencyList = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> newNode = new LinkedList<>();
        newNode.add(node);
        adjacencyList.add(newNode);
    }
    public void addEdge(Node node,Node node1){
        int flagNode1 = -1,flagNode2=-1;
        for(int i=0;i<adjacencyList.size();i++){
            if(adjacencyList.get(i).getFirst()==node){
                flagNode1 = i;
            }
            if(adjacencyList.get(i).getFirst()==node1){
                flagNode2 = i;
            }
        }
        if(flagNode1==-1){
            LinkedList<Node> newNode = new LinkedList<>();
            newNode.add(node);
            flagNode1 = adjacencyList.size();
            adjacencyList.add(newNode);
        }
        if(flagNode2==-1){
            LinkedList<Node> newNode = new LinkedList<>();
            newNode.add(node1);
            adjacencyList.add(newNode);
        }
        adjacencyList.get(flagNode1).add(node1);
    }
    public void printNodes(){
        for(LinkedList<Node> l:adjacencyList){
            for(Node nd:l){
                System.out.print(nd.data+"-->");
            }
            System.out.println();
        }
    }

    public void depthFirstSearch(Node node){
        dfsHelper(node);
    }

    private void dfsHelper(Node node){
        if(node.visited){
            return;
        }
        node.visited = true;
        System.out.println("Visited Node "+node.data);
        int indexNode = -1;
        for(int i=0;i<adjacencyList.size();i++){
            if(adjacencyList.get(i).getFirst()==node){
                indexNode = i;
                break;
            }
        }
        for(int i=1;i<adjacencyList.get(indexNode).size();i++){
            dfsHelper(adjacencyList.get(indexNode).get(i));
        }
    }
}
