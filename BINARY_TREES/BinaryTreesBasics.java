package BINARY_TREES ;

public class BinaryTreesBasics  {

    public static class Node {      //this is a node class 
        int data ;
        Node left ;
        Node right ;

        public Node (int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    public static class BinaryTrees {
        static int idx = -1 ;
        public static Node buildTrees (int nodes []){
             idx++ ;
             if(nodes[idx] == -1){
                return null ;
             }

             Node newNode = new Node (nodes[idx]);  //root
             newNode.left = buildTrees(nodes);     //left child
             newNode.right = buildTrees(nodes);    //right child

             return newNode ;
            }
    }
    public static void main(String[] args) {

         int nodes [] = {1 , 2, 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1 , 6 , -1 , -1};

         BinaryTrees tree = new BinaryTrees ();
         Node root = tree.buildTrees(nodes);   //calling a function

         System.out.println(root.data);
    }
}