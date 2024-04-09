package Tree;

public class BinarySearchTree {
    Node root;

    public void insert(Node node){
        root = insertHelper(root,node);
    }

    private Node insertHelper(Node root,Node node){
        if(root==null){
            root = node;
        }
        else if(root.data>= node.data){
            root.left = insertHelper(root.left,node);
        }
        else {
            root.right = insertHelper(root.right,node);
        }
        return root;
    }
    public void display(){
        displayHelper(root);
    }
    private void displayHelper(Node root){
        if(root==null){
            return;
        }
        // In Order Traversal
//        displayHelper(root.left);
//        System.out.println(root.data);
//        displayHelper(root.right);
        // Post-Order Traversal
//        displayHelper(root.left);
//        displayHelper(root.right);
//        System.out.println(root.data);
        // Pre-Order Traversal
        //        System.out.println(root.data);
//        displayHelper(root.left);
//        displayHelper(root.right);
    }

    public boolean search(int data){
        return searchHelper(root,data);
    }

    public boolean searchHelper(Node root,int data){
        if(root==null){
            return false;
        }
        else if(root.data==data){
            return true;
        }
        else if(root.data>data){
            return searchHelper(root.left,data);
        }
        else{
            return searchHelper(root.right,data);
        }
    }

    public void delete(int data){
        root = deleteHelper(root,data);
    }

    private Node deleteHelper(Node root,int data){
        if(root==null){
            return null;
        }
        if(root.data>data){
            root.left = deleteHelper(root.left,data);
        }
        else if(root.data<data){
            root.right = deleteHelper(root.right,data);
        }
        else {
            if(root.left==null&&root.right==null){
                return null;
            }
            root = replaceNode(root.right,root.left);
        }
        return root;
    }

    private Node replaceNode(Node root,Node newNode){
        if(root==null){
            return newNode;
        }
        root.left = replaceNode(root.left,newNode);
        return root;
    }
}
