package BINARY_TREES;

public class SumTree {
    public static class Node{   // this is a node class
        int data ;
        Node left , right ;

        public Node (int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    public static int transform (Node root){
        if(root == null){
            return 0;
        }

        int leftChild = transform(root.left);   // moving to left and right child
        int rightChild = transform(root.right);  

        int data = root.data ;   //store root ka data in data  
        int newLeft = root.left == null ? 0 : root.left.data ;   //store root ka left in newLeft
        int newRight = root.right == null ? 0 : root.right.data ;  //store root ka right in newRight
        
        //updation
        root.data = leftChild + newLeft + rightChild + newRight ;
        
        return data ;
        
    }

    public static void preorder (Node root){     //preorder
        if(root == null){
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        /*
                        1
                       / \
                      2   3
                     / \   \
                    4   5   6  
         */

        transform(root);       //transforming the tree
        preorder(root);        //printing the transformed tree
    }
}
