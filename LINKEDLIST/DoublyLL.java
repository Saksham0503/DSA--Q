package LINKEDLIST;

public class DoublyLL {
    
    public static class Node {   //this is node class
        int data;    //properties
        Node next;
        Node prev;
        public Node(int data){     //constructor
            this.data = data ;
            this.next = null ;
            this.prev = null ;
        }
    }
    public static Node head ;
    public static Node tail ;
    public static int size;

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
        head.prev = newNode ;

        //new head
        head = newNode ;
        newNode.prev = null ;
    }

    //addLast
    public static void addLast(int data){
        //creation of node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode ;
            return ;
        }

        //link
        tail.next = newNode;
        newNode.prev = tail ;

        //new tail
        tail = newNode ;
        newNode.next = null ;
    }

    //print
     public static void print(){
        if(head == null){
            System.out.println("dll is empty !");
            return;
        }
        Node temp = head ;
        System.out.print("null<--");
        while(temp != null){
            System.out.print(temp.data+"<-->");
            temp =temp.next ;
        }
        System.out.println("null");
     }

    //remove first
     public static int removeFirst(){
        if(size == 0){
           System.out.println("ll is empty ");
           return Integer.MAX_VALUE;
        }

        if(size==1){
            int val = head.data;
            head = tail = null ;
            size--;
            return val ;
        }

        int val = head.data;
        head = head.next ;
        head.prev = null;
        size--;
        return val ;
     }

     //removeLast
     public static int removeLast(){
        if(size == 0){
            System.out.println("Dll is empty !!");
            return Integer.MAX_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null ;
            size--;
            return val ;
        }

        Node prev = head ;       
        for(int i = 0; i < size-2 ; i++){
            prev = prev.next;
        }

        int val = prev.next.data;  //tail ka data 
        tail.prev = prev ;  
        tail = prev ;
        tail.next = null ;
        size--;
        return val;
     }
      
     //reverse
     public static void reverse(){
        Node prev = null ;
        Node curr = head ;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev=next;    //single change (i.e curr node ka prev ab next ko point krega)
            prev = curr;
            curr = next;
        }
        head = prev;
     }
    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.print();             //print    
                      
        ll.removeFirst();    //remove first
        ll.print();

        ll.removeLast();     //remove last
        ll.print();

        ll.reverse();     //reverse 
        ll.print();    
    }
}
