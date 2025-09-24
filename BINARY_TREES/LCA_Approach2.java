package BINARY_TREES;

public class LCA_Approach2 {
    public static class Node {   //this is the node class
         int data;
         Node left , right ;

         public Node(int data){
             this.data = data ;
             this.left = null ;
             this.right = null ;
         }
    }

    public static Node LCA (Node root , int n1 , int n2){
        if(root == null){
            return null ;
        }

        if(root.data == n1 || root.data == n2){
            return root;
        }

        Node foundLeft = LCA(root.left, n1, n2);        //left child
        Node foundRight = LCA(root.right, n1, n2);      //right child

        //foundLeft has val && foundRight is null , then return left 
        if(foundRight == null){
            return foundLeft ;
        }

        //foundRight has Val && foundLeft is null , then return right
        if(foundLeft == null){
            return foundRight ;
        }

        return root;     //foundLeft and foundRight both has values 
    } 
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int n1 = 4 , n2 = 5 ;

        //printing the lowest common ancestor
        System.out.println(LCA(root,n1,n2).data);
    }
}
