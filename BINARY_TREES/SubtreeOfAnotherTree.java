package BINARY_TREES;

public class SubtreeOfAnotherTree {
    public static class Node { // this is a node class
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node root, Node subroot) {
        // check for not identical
        // condition - 1
        if (root == null && subroot == null) {
            return true; // becaue they are identical
        }

        // condition - 2 & 3 (root and subroot are not identical)
        else if (root == null || subroot == null || root.data != subroot.data) {
            return false;
        }

        // left and right child are not identical
        if (!isIdentical(root.left, subroot.left)) {
            return false;
        }
        if(!isIdentical(root.right , subroot.right)){
            return false;
        }


        return true ;
    }

    public static boolean isSubtree(Node root, Node subroot) {
        if (root == null) {
            return false; // because subroot will not exist after leaf node
        }

        // step 1 -->> find the subroot
        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }

        // search in left child for subroot

        // search in right child for subroot

        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);

    }

    public static void main(String[] args) {
        // root
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // subroot
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println(isSubtree(root , subroot));    //checking for the subtree 
    }
}
