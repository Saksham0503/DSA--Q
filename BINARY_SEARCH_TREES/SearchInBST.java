package BINARY_SEARCH_TREES;

public class SearchInBST {
    public static class  Node {   //this is a node class
         int data ;
         Node left , right ;

         public Node (int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
         }
    }
    
    //insert function
    public static Node insert (Node root , int val){
        //step 1 --> root 
        if(root == null){
            root = new Node(val);
            return root ;
        }

        //step 2 --> insert in left of root
        if(val < root.data){
            root.left = insert(root.left , val);
        }
        //step 3 --> insert in right of root
        else{
            root.right = insert(root.right , val);
        }

        return root ;
    }

    //key searching 
    public static boolean search(Node root , int key){
        if (root == null){
            return false;
        }

        if(root.data == key){  //key is found
            return true;
        }

        if(root.data > key){   
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }

    }

    //inorder traversal
    public static void inorder(Node root){
        if(root == null){
            return ;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values [] = {5 , 2 , 4 , 1 , 7};
        Node root = null ;

        for(int i = 0 ; i < values.length ; i++){
            root = insert(root, values[i]);
        }

        int key = 7;
        System.out.println(search(root, key));       //calling the function
        //verification 
        inorder(root);
    }
}
