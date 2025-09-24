package BINARY_TREES;

public class SumOfNodes {
    public static class Node {      //this is a node class
        int data ;
        Node left , right ;

        public Node (int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    public static int sumOfNodes (Node root){
        if (root == null){
            return 0 ;
        }

        int leftSum = sumOfNodes(root.left);     //left subtree
        int rightSum = sumOfNodes(root.right);   //right subtree

        return leftSum + rightSum + root.data ;   
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(sumOfNodes(root));      //printing sum of nodes
    }
}
