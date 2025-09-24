package BINARY_SEARCH_TREES;

import java.util.ArrayList;

public class ConvertBSTintoBalancedBST {
    public static class Node { // this is a node class
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // helper function 1
    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);      //keep on adding roots in arr 
        getInorder(root.right, arr);
    }

    // helper function 2
    public static Node createBST (ArrayList <Integer> arr , int start , int end){
        if(start > end){
           return null ;
        }

        int mid = (start + end)/2 ;
        Node root = new Node(arr.get(mid));   //root of the BST 

        root.left = createBST(arr, start, mid-1);      //left child
        root.right = createBST(arr, mid+1, end);       //right child
        
        return root;
    }

    public static Node balancedBST(Node root) {

        // step 1 --> get the sorted array (i.e. inorder sequence of BST)
        ArrayList<Integer> arr = new ArrayList<>();
        getInorder(root, arr);

        // step 2 ---> sorted array to balanced BST
        root = createBST(arr, 0 , arr.size()-1);
        
        return root;
    }

    public static void main(String[] args) {
        
        // unbalanced BST
         Node root = new Node(8);
         root.left = new Node(6);
         root.right = new Node(10);
         root.left.left = new Node(5);
         root.right.right = new Node(11);
         root.left.left.left = new Node(3);
         root.right.right.right = new Node(12);

         //preorder
         preorder(root);
         System.out.println();

         root = balancedBST(root);
         preorder(root);
         System.out.println();

    }
}
