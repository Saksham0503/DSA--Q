package BINARY_SEARCH_TREES;

public class BuildTREE {
    public static class Node { // this is a node class
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //inserting nodes in tree
    public static Node insert(Node root, int val) {
        // step 1 -->> root creation
        if (root == null) {
            root = new Node(val);
            return root ;
        }

        // step 2 -->> left child
        if (val < root.data) {
            root.left = insert(root.left, val);
        }

        // step 3 -->> right child
        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // inorder traversal gives sorted binary tree
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]); // calling bst function
        }

        // verification
        inorder(root); // if sorted array comes , then BST is right

    }
}
