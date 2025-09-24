package BINARY_TREES;

public class DiameterApproach1 {  //O(n^2)
    public static class Node {
        int data ;
        Node left ;
        Node right ;

        public Node (int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }
    
    public static int height (Node root){     //calculating height 
        if (root == null){
            return 0 ;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh , rh) + 1 ;
    }

    public static int diameter (Node root){      //calculating diameter
        if(root == null){
            return 0 ;
        }
        
        int leftDiam = diameter(root.left);   //left child 's diam
        int leftHeight = height(root.left);    //left child' s height

        int rightDiam = diameter(root.right);  //right child ' s diam
        int rightHeight = height(root.right);   //right child 's height

        int selfDiam = leftHeight + rightHeight + 1 ;    //roots diameter

        return Math.max(Math.max(rightDiam, leftDiam) , selfDiam);  

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node (6);

        System.out.println(diameter(root));  //printing diameter  

    }
}

