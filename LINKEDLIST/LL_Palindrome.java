package LINKEDLIST;

import org.w3c.dom.traversal.NodeFilter;

public class  LL_Palindrome{

    public static class Node{      //THIS IS NODE class
        int data ;         //properties
        Node next ;

        public Node (int data){       //constructor
            this.data = data ;
            this.next = null ;
        }
    }
    public static Node head ;
    public static Node tail ;
    public static int size ;

    //addFirst
    public static void addFirst (int data){
        //creation of node
        Node newNode = new Node(data);
        size++;
        if(head == null){    
            head = tail = newNode ;
            return;
        }

        //link
        newNode.next = head;
        head = newNode ;     //new head node
    }

    //print
    public static void print(){
        Node temp = head;
        if(head == null){
            System.out.println("ll is empty");
            return ;
        }
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next ;
        }
        System.out.println("null");
    }

    //pallindrome 
    public static Node findMid (Node head){    //using slow-fast approach
        //mid
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){     //fast is equal to null in case of even***fast.next is equal to null in case of odd
            slow = slow.next ;            //+1
            fast = fast.next.next ;       //+2 
        }
        return slow ;     //slow is my mid node 
    }

    public static boolean checkPallindrome(){

        if(head == null && head.next == null){          //linkedlist is empty or linkedlist has 1 node
           return true ;
        }

        //step 1 --> find the mid
        Node midNode = findMid(head) ;  
        
        //step 2 --> reverse the 2nd half
        Node prev = null ;
        Node curr = midNode ;
        Node next;

        while(curr != null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }

        Node right = prev ;        //head of 2nd half
        Node left = head ;         //head of 1st half

        //step 3 : check left and right Half
        while(right != null){
            if(right.data != left.data){
                return false ;
            }

            left = left.next ;           //updation
            right = right.next ;
        }
         return true;
    }
    public static void main(String[] args) {
        LL_Palindrome ll = new LL_Palindrome();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();
        
        System.out.println(checkPallindrome());      //calling the function
    }
}
