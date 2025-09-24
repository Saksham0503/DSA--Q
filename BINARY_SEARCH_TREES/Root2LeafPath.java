package BINARY_SEARCH_TREES;
import java.util.* ;
public class Root2LeafPath {
    public static class Node {       //this is Node class
        int data ;
        Node left , right ;

       public Node (int data){
         this.data = data ;
         this.left = null ;
         this.right = null ;
       }
    }

    public static Node insert (Node root, int val){                   //this helps in node insertion 
        if (root == null) {
           root = new Node (val);
           return root ;
        }

        if (root.data > val){
            root.left = insert(root.left , val);
        }else{
            root.right = insert(root.right , val);
        }

        return root ;
    }

    public static void inorder (Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void printRoot2Leaf (Node root , ArrayList <Integer> path){ 
         if(root == null){
            return ;
         }

         path.add(root.data);          //add root in path

         if(root.left == null && root.right == null){
             printPath(path);
         }

         printRoot2Leaf(root.left , path);        //left child
         printRoot2Leaf(root.right , path);       //right child

         path.remove(path.size() - 1);      //remove from path

    }

    public static void printPath (ArrayList <Integer> path){
        
        for (int i =0 ; i < path.size() ; i++){
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int values [] = {8 , 5 , 3 , 1 , 4 , 6 , 10 , 11 , 14};
        Node root = null ;

        for(int i = 0 ; i < values.length ; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        ArrayList <Integer> path = new ArrayList<>() ;
        printRoot2Leaf(root , path);             //calling to print from root to leaf 

    }
}
