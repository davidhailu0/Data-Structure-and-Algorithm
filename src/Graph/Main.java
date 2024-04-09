package Graph;

public class Main {
    public static void main(String[] args) {
        GraphMatrix newGraph = new GraphMatrix(5);
//        GraphAdjacency newGraph = new GraphAdjacency();
        Node node = new Node('A');
        Node node1 = new Node('B');
        Node node2 = new Node('C');
        Node node3 = new Node('D');
        Node node4 = new Node('E');
        newGraph.addNode(node);
        newGraph.addNode(node1);
        newGraph.addNode(node2);
        newGraph.addNode(node3);
        newGraph.addNode(node4);


        newGraph.addEdge(node,node1);
        newGraph.addEdge(node1,node2);
        newGraph.addEdge(node1,node4);
        newGraph.addEdge(node2,node3);
        newGraph.addEdge(node2,node4);
        newGraph.addEdge(node4,node);
        newGraph.addEdge(node4,node2);
//        newGraph.printNodes();
//        newGraph.depthFirstSearch(node1);
        newGraph.breadthFirstSearch(node);
    }
}
