package BINARY_TREES;

public class MinDisBwNodes {
    public static class Node {
        int data ;
        Node left , right ;

        public Node (int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    //step -1 : found the LCA
    public static Node LCA (Node root , int n1 , int n2){
        if(root == null){
            return null ;
        }

        if(root.data == n1 || root.data == n2){
            return root ;
        }

        Node foundLeft = LCA(root.left, n1, n2);
        Node foundRight = LCA(root.right, n1, n2);

        if(foundRight == null){
            return foundLeft ;
        }
        if(foundLeft == null){
            return foundRight ;
        }

        return root ;
    }

    //step - 2 : minimum distance b/w nodes 
    public static int MinDistance (int n1 , int n2 ,Node root){
        Node lca = LCA(root, n1, n2);   //calling the lca function
        int dist1 = LCADist(lca , n1);      //distance from node 1 to lca
        int dist2 = LCADist(lca , n2);      //distance from node 2 to lca

        return dist1 + dist2 ;
    }

    //distance (lca to nodes)
    public static int LCADist (Node root , int n){
        if(root == null){
            return -1 ;
        }

        if (root.data == n){
            return 0 ;        //root is only n , means distance is 0
        }

        //move to left and right child for searching
        int leftDis = LCADist(root.left , n);
        int rightDis = LCADist(root.right , n);
        
        if(leftDis == -1  && rightDis == -1){      //left aur right child dono ke pass node n nhi hai
            return -1 ;
        }
        else if (leftDis == -1){        //left ke paas nhi hai mtlb right ke paas hogi
            return rightDis + 1;
        }else{
            return leftDis + 1;         //right ke paas nhi mtlb left ke paas hogi
        }

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        /*             1
                      / \
                     2   3
                    / \   \
                   4   5   6 
         */

        int n1 = 2 , n2 = 6; 
        System.out.println(MinDistance(n1 , n2 , root));    //printing min distance bw the nodes
    }
}
