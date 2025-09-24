package LINKEDLIST;

public class Circular_LL {

    public static class Node {   //this is node class
        int data ;            //properties
        Node next ,prev;   
        
        public Node (int data){    //constructor
            this.data = data ;
            this.next = null ;
            this.prev = null ;
        }
    }
    public static Node head ;
    public static Node tail ;
    public static int size ;

    //in singly linked list
    public static void addLast (int data){

        //CREATION 
        Node newNode = new Node(data);
        if(head == null){
           head = tail = newNode;
           return ;
        }

        //link
        tail.next = newNode;
        
        //new Tail
        tail = newNode ;
        tail.next = head ;
    }

    //print
    public static void print(){
        if(head == null){
            System.out.println("cll is empty");
            return;
        }
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next ;
        }
        System.out.println();
    }

    //doubly linked list
    public static void addLast1 (int data){
        //creation of newnode
        Node newNode = new Node (data);
        if(head == null){
            System.out.println("cdll is empty");
            return ;
        }

        //link
        tail.next = newNode;
        newNode.prev = tail ;

        //new TAIL
        tail = newNode;
        newNode.next = head ;
        head.prev = tail;
        
    }
    public static void main(String[] args) {
        Circular_LL ll = new Circular_LL();
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.print();   //infinite loop

        ll.addLast1(11);
        ll.addLast1(12);
        ll.addLast1(13);
        ll.addLast1(14);

        ll.print();   //infinite loop
    }
}
