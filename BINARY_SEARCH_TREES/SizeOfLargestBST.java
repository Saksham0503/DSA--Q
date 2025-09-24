package BINARY_SEARCH_TREES;

public class SizeOfLargestBST {
    public static class Node {
        int data ;
        Node left , right ;

        public Node (int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    public static class Info {       //this is a info class
        boolean isBST ;
        int size ;
        int min ;
        int max ;

        public Info(boolean isBST , int size , int min , int max){
            this.isBST = isBST ;
            this.size = size ;
            this.min = min ;
            this.max = max ;
        }        
    }


    public static int maxBST = 0 ;     //size of the BST
    public static Info largestBST (Node root){
         if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
         }

         Info leftInfo = largestBST(root.left);      //left child
         Info rightInfo = largestBST(root.right);    //right child

         //for the root
         int size = leftInfo.size + rightInfo.size + 1 ;      //size
         int min = Math.min(root.data , Math.min(leftInfo.min, rightInfo.min)) ;      //min
         int max = Math.max(root.data , Math.max(leftInfo.max, rightInfo.max)) ;      //max

         if(root.data <= leftInfo.max || root.data >= rightInfo.min){         //invalid BST condition
            return new Info(false, size, min, max);      
         }

         if(leftInfo.isBST && rightInfo.isBST){   //valid bst
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
         }
         
         return new Info(false, size, min, max);

    }



    public static void main(String[] args) {
        //this is a BT
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);


        Info BSTinfo = largestBST(root);         //calling largest BST in the above BT
        System.out.println("THE SIZE OF LARGEST BST IS : "+ maxBST);
    }
}
