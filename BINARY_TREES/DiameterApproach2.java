package BINARY_TREES;

public class DiameterApproach2 {

    public static class Node {       //this is node class
        int data ;
        Node left , right ;

        public Node (int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    public static class Info {        //this is Info class
        int diam ;  
        int ht ;

        public Info (int diam , int ht ){
            this.diam= diam ;
            this.ht = ht ;
        }
    }

    public static Info calDiam (Node root){  //O(n)
       if(root == null){
          return new Info(0, 0);
       } 

       Info leftInfo = calDiam(root.left);           //left child
       Info rightInfo = calDiam(root.right);         //right child

       int diameter = Math.max(Math.max(leftInfo.diam , rightInfo.diam) , leftInfo.ht + rightInfo.ht + 1 ); 
       int height = Math.max(leftInfo.ht , rightInfo.ht) + 1 ;

       return new Info(diameter, height) ;   
    }
    public static void main(String[] args) {
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.right = new Node(6);

       System.out.println(calDiam(root).diam);       //calling the function 
    }
}
