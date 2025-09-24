package BINARY_TREES;

import java.util.ArrayList;

public class LCA_Approach1 {
    public static class Node {        //this is a node class
        int data ;
        Node left , right ;

        public Node (int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }
    public static boolean getPath (Node root , int n , ArrayList<Node> path){
        if(root == null){
            return false ;
        }
        path.add(root);    //add the nodes in path till we get reach at node n

        if(root.data == n){    //root is equal to node n 
            return true;
        }
        
        boolean foundLeft = getPath(root.left, n, path);      //left child
        boolean foundRight= getPath(root.right, n, path);     //right child

        if(foundLeft || foundRight){       //if found in left or in right subtree
            return true;
        }

        path.remove(path.size()-1);        //remove from path

        return false ;      // if not found 
    }

    public static Node LCA (int n1 , int n2 , Node root){
        //step 1 --->> calculate the path
        ArrayList <Node> path1 = new ArrayList<>();
        ArrayList <Node> path2 = new ArrayList<>();

        getPath(root , n1 ,path1);
        getPath(root , n2 ,path2);

        //check for LCA
        int i =0;
        for( ;i < path1.size() && i < path2.size() ; i++ ){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        //the index where for the last time we had our nodes equal i.e. last equal node is (i-1)th
        Node LCA = path1.get(i-1);
        
        return LCA ;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node (5);
        root.right.right = new Node (6);

        /*
                     1
                    / \
                   2   3
                  / \   \
                 4   5    6 
         */

        int n1 = 4, n2 = 3 ;
        
        //finding our lowest common ancestor 
        System.out.println(LCA(n1, n2, root).data);
    }   
}
