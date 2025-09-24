package BINARY_TREES;

public class InorderTraversal {

    public static class Node {  //this is a node class
        int data ;
        Node left , right ;

        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null ;
        }
    }

    public static class BinaryTree {   //this is a binarytree class
        static int idx = -1 ;
        public static Node buildTree (int nodes[]){
            idx++ ;

            if (nodes[idx] == -1){
                return null ;
            }
            Node root = new Node(nodes[idx]);   // root
            root.left = buildTree(nodes);    //leftchild
            root.right = buildTree(nodes);    //rightchild

            return root ;
        }

        public static void inorder (Node root){
            if(root == null){
              return ;
            }

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    
    public static void main(String[] args) {
        int nodes[] = {1, 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1 , 6 , -1 , -1};

        BinaryTree mytree = new BinaryTree() ;  //object creation
        Node root = mytree.buildTree(nodes);     //calling function 1

        mytree.inorder(root);       //calling the function
    }
}
