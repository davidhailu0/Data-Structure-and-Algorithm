package Tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(new Node(5));
        binarySearchTree.insert(new Node(7));
        binarySearchTree.insert(new Node(6));
        binarySearchTree.insert(new Node(8));
        binarySearchTree.insert(new Node(9));
        binarySearchTree.insert(new Node(11));
        binarySearchTree.insert(new Node(10));
        binarySearchTree.insert(new Node(12));
        binarySearchTree.insert(new Node(1));
        binarySearchTree.insert(new Node(2));
        binarySearchTree.insert(new Node(3));
        binarySearchTree.delete(9);
        binarySearchTree.display();
        System.out.println(binarySearchTree.search(3));
    }
}
