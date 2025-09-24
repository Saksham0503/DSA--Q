package BINARY_SEARCH_TREES;

public class ValidateBST {
    public static class Node { // this is node class
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean isValid(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) { // check for the root
            return false;
        }
        if (max != null && root.data >= max.data) { // check for the root
            return false;
        }

        return isValid(root.left, min, root) && isValid(root.right, root, max); // check for left and right subtree

    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);

        // Approach 1
        inorder(root); // if sorted array then BST is valid
        System.out.println();

        // Approach 2
        if (isValid(root, null, null)) {
            System.out.println("BST is valid ");
        } else {
            System.out.println("BST is invalid ");
        }

    }
}
