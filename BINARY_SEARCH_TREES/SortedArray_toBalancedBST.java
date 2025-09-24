package BINARY_SEARCH_TREES;

public class SortedArray_toBalancedBST {
    public static class Node{
        int data ;
        Node left ;
        Node right ;

        public Node(int data){
            this.data = data;
            this.left = null ;
            this.right = null ;
        }
    }

    public static void preorder (Node root){
        if(root == null){
            return ;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder (Node root){
        if(root == null){
            return ;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    } 

    public static Node BalancedBST (int arr [] , int start , int end){
        if(start > end){
            return null ;
        }

        int mid =  (start + end)/2 ;
        Node root = new Node(arr[mid]);   //root of the tree

        root.left = BalancedBST(arr, start, mid - 1);      //left child
        root.right = BalancedBST(arr, mid+1, end);         //right child

        return root ;
    }
    public static void main(String[] args) {
        int arr [] = { 3 , 5 , 6 , 8 , 10 , 11 , 12};
        Node root = BalancedBST(arr, 0, arr.length - 1);      //calling the balanced bst function

        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();

    }
}
