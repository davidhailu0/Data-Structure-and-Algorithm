package Graph;

public class Node {
    int index = -1;
    boolean visited = false;
    char data;
    Node(char data){
        this.data = data;
    }
    void setIndex(int index){
        this.index = index;
    }
}
