package BINARY_SEARCH_TREES;
import java.util.ArrayList;

import ARRAYLIST.ArrListB;

public class Merge2BST {
    public static class Node {
        int data ;
        Node left, right ;

        public Node (int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }
    
    public static void preorder (Node root){
        if(root == null){
            return ;
        }

        System.out.print(root.data+ " " );
        preorder(root.left);
        preorder(root.right);
    }
    //helper function 1
    public static void getInorder (Node root , ArrayList <Integer> arr){
         if(root == null){
            return ;
         }

         getInorder(root.left, arr);
         arr.add(root.data);
         getInorder(root.right, arr);
    }

    //helper function 2
    public static Node createBST (ArrayList <Integer> arr , int start , int end){
        if(start > end){
          return null ;
        }

        int mid = (start+end)/2;
        Node root = new Node(arr.get(mid));       //root of BST

        root.left = createBST(arr, start, mid-1);       //left child
        root.right = createBST(arr, mid+1 , end);       //right child

        return root;

    }

    public static Node mergeBSTs (Node root1 , Node root2){
         //step 1 --> sorted array of first BST
         ArrayList <Integer> arr1 = new ArrayList<>();
         getInorder(root1, arr1);

         //step 2 --> sorted array of second BST
         ArrayList <Integer> arr2 = new ArrayList<>();
         getInorder(root2, arr2);

         //step 3 --> //merging
         ArrayList <Integer> finalArr = new ArrayList<>();

         int i = 0  , j = 0 ;
         while(i< arr1.size() && j < arr2.size()){

            if(arr1.get(i) < arr2.get(j)){  //add smallest first
                finalArr.add(arr1.get(i));
                i++;
            }else{
                finalArr.add(arr2.get(j));
                j++;
            }
         }

         //agar lkuch bach gya toh 
         while(i < arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
         }
         while (j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
         }

         //step 4 --> create a new BST from sorted array
         Node root = createBST(finalArr , 0 , finalArr.size()-1);
         
         return root;
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        preorder(root);
    }
}
