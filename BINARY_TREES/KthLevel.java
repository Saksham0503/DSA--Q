package BINARY_TREES ;
public class KthLevel {

    public static class Node{    //this is a node class
        int data ;
        Node left , right ;

        public Node(int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    public static void kLevel (int k , int level , Node root){
        if(root == null){
            return ;
        }

        if(level == k){
            System.out.print(root.data + " ");
            return ;
        }

        kLevel(k, level+1, root.left);   //left child
        kLevel(k, level+1, root.right);   //right child

        return ;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right =new Node(6);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(8);
        root.right.right.right =new Node(9);

        /*
                     1
                    / \
                   2   3
                  / \   \
                 4   5   6  
                / \       \
               7   8       9
         */

         int k = 4 ;
         kLevel(k, 1, root);    //printing the nodes at kth level
  
    }
}
