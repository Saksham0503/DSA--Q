package BINARY_TREES;

public class CountOfNodes {
    public static class Node {       //this is a node class
        int data ;
        Node left ;
        Node right ;

        public Node(int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    public static int count (Node root){
        if(root == null){
            return 0 ;
        }

        int lCount = count(root.left);    //left subtree
        int rCount = count(root.right);    //right subtree

        return lCount + rCount + 1 ;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(count(root));     //printing count
    }
}
