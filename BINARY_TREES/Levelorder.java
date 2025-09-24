package BINARY_TREES;

import java.util.*;

public class Levelorder { // we will be doing BFS
    public static class Node { // this is a node class
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        public static Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node root = new Node(nodes[idx]);
            root.left = buildtree(nodes);
            root.right = buildtree(nodes);

            return root;
        }

        public static void levelorder(Node root) {
            // step 1 --> store values in a queue
            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                
                Node currNode = q.remove();

                if (currNode == null) {    // check the curr Node
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else { // if curr node is not null
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int nodes [] = {1 , 2 , 4 , -1 , -1 , 5 , -1 , -1 ,3 , -1 , 6 , -1 , -1};

        BinaryTree mytree = new BinaryTree();      //creation of object
        Node root = mytree.buildtree(nodes);      //this is my root

        mytree.levelorder(root);      //printing level order
    }
}
