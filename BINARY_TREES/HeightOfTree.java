package BINARY_TREES;

public class HeightOfTree {
    public static class Node {   //this is node class
        int data ;
        Node left , right ;

        public Node (int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;

        }
    }

    public static int height (Node root){       //calculating height 
        if(root == null){    
            return 0;
        }

        int lh = height(root.left);    //left subtree
        int rh = height(root.right);  //right subtree

        return Math.max(lh, rh) + 1 ;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(height(root));     //printing height
    }
}
