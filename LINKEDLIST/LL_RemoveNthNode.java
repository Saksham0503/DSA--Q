package LINKEDLIST;

public class LL_RemoveNthNode {
    
    public static class Node {      //this is node class
        int data ;          //properties
        Node next ;

        public Node (int data) {   //constructor
          this.data = data ;
          this.next = null ;
        }
    }

    public static Node head ;
    public static Node tail ;
    public static int size ;

    //addFirst
    public static void addFirst (int data){
        //creation of new Node 
        Node newNode = new Node(data);
        size++;
        if(head == null){
           head = tail = newNode ;
           return;
        }
        size++;
        newNode.next = head;    //link
        head = newNode ;        //new node 
    }
    
    //addLast
    public static void addLast (int data){
        //creation of newNode
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode ;
            return ;
        }

        tail.next = newNode ;  //link
        tail = newNode ;    // new tail
    }


    //print
    public static void print(){
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data +"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //find and remove nth node from end
    public static void remove(int n){

        //calculate size
        int sz = 0 ;
        Node temp = head ;
        while(temp != null){
            temp = temp.next ;
            sz++;
        }

        if(n == sz ){            //base case
            head = head.next;    //remove first
            return ;
        }
        //sz-n+1
        int i = 0 ;     
        int iToFind = sz - n + 1 ;

        Node prev = head ;
        while (i < iToFind-2){
            prev = prev.next ;
            i++;
        }
        prev.next = prev.next.next ;  
        return; 
    }


    public static void main(String[] args) {
        LL_RemoveNthNode ll = new LL_RemoveNthNode();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();     //printing

        remove(5);    //remove nth node from end
        ll.print();

        remove(1);
        ll.print();   
    }
}

