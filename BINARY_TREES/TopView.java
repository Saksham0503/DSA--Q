package BINARY_TREES;

import java.util.*;

public class TopView {
    public static class Node {         //this is a node class
        int data ;
        Node left , right ;

        public Node (int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    public static class Info {         //this is info class
        Node node ;
        int hd ;

        public Info(Node node , int hd ){
            this.node = node ;
            this.hd = hd ;
        }
    }

    public static void topView (Node root){
        //level order traversal
        Queue <Info> q = new LinkedList<>() ;
        HashMap < Integer , Node > map = new HashMap<>();   //hashmap in which we will store our hd and node
        
        int min = 0 , max = 0 ;
        q.add(new Info (root ,0));
        q.add(null);
    
        while(!q.isEmpty()){
            Info currNode = q.remove();

            if(currNode == null){
               if(q.isEmpty()){
                break;
               }else{
                 q.add(null);
               }
            }else{
               if(!map.containsKey(currNode.hd)){     //first time the horizontal distance has ocuured
                 map.put( currNode.hd , currNode.node);
               }

               if(currNode.node.left != null ){
                 q.add(new Info( currNode.node.left , currNode.hd - 1));
                 min = Math.min(min , currNode.hd - 1);
               }

               if(currNode.node.right != null){
                 q.add(new Info(currNode.node.right, currNode.hd + 1));
                 max = Math.max(max , currNode.hd + 1);
               }
            }
        }
        
        // printing the top view in binary tree
        for(int i = min ; i <= max ; i++){ 
            System.out.print(map.get(i).data  + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Node root = new Node (1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        /*        1
                 / \
                2   3
                 \
                  4
                   \
                    5
                     \
                      6
         */

         topView(root);   //printing top view 

    }
}
