package BINARY_SEARCH_TREES;

public class MirrorABST {
    public static class Node { // this is a node class
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder (Node root){
        if(root == null){
            return ;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }

        // step 1 --> store left and right value
        Node leftChild = mirror(root.left);
        Node rightChild = mirror(root.right);

        // change left to right child and vice-versa
        root.left = rightChild;
        root.right = leftChild;

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();

        // calling mirror for BST
        mirror(root);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
    }
}
