package BINARY_TREES;

public class PreorderTraversal {

    public static class Node {       //this is a node class
        int data ; 
        Node left , right ;

        public Node (int data){
           this.data = data ;
           this.left = null ;
           this.right = null ;
        }
    }
    
    public static class BinaryTrees {       //this is a binary tree class
        //.... 
        static int idx = -1 ;
        public static Node buildTrees (int nodes []){
            idx++ ;
            if (nodes[idx] == -1){
                return null ;
            }

            Node root = new Node(nodes[idx]);  //root
            root.left = buildTrees(nodes);     //leftchild
            root.right = buildTrees(nodes);    //rightchild

            return root ;
        }
        //.....
        public static void preorder (Node root){   //preorder traversal --> O(n)
            if (root == null){
                return ;
            }    
             
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right) ;
        }
    }
    public static void main(String[] args) {
        int nodes [] = {1 , 2, 4 , -1 , -1 , 5 , -1 ,-1 , 3 , -1 , 6 , -1 , -1};

        BinaryTrees mytree = new BinaryTrees();

        Node root = mytree.buildTrees(nodes);   // calling function 1
        mytree.preorder(root);   //calling function 2
    }
}
