package BINARY_TREES;

public class PostorderTraversal {
    public static class Node{        //this is a node class
        int data ;
        Node left , right ;

        public Node (int data) {
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    public static class BinaryTree {         //this is a binary tree class
        static int idx = -1 ;
        public static Node buildTree (int nodes[]){
            idx++ ;
            if (nodes[idx] == -1){
                return null;
            }

            Node root = new Node(nodes[idx]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);

            return root ;
        }

        public static void postorder (Node root){      
            if(root == null){
                return ;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        int nodes [] = {1 , 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1 , 6 , -1  , -1};

        BinaryTree mytree = new BinaryTree() ;  //object creation
        Node root = mytree.buildTree(nodes);  // root of tree
        mytree.postorder(root);       //calling postorder
    }

}
