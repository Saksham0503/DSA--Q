package LINKEDLIST;

public class CheckCyclic {
    public static class Node {
        int data ;    //properties
        Node next ;

        public Node(int data){       //constructor
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail ;
    public static int size ;
    
    //addFirst
    public static void addFirst (int data){
        //creation of node
        Node newNode = new Node (data);

        if(head == null){
          head = tail = newNode ;
        }

        newNode.next = head ;        //link
        head = newNode ;       //new head node
    }

    //print
    public static void print (){
        Node temp = head ;
        if(head == null){  
            System.out.println("ll is empty ");
            return ;
        }

        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next ;
        }
        System.out.println("null");
    }

    //check whether it is cyclic 
    public static Boolean isCycle (){
        Node slow = head ;
        Node fast = head ;

        while(fast != null && fast.next !=null){
            slow = slow.next ;     //+1
            fast = fast.next.next ;  //+2

            if (slow == fast){
                return true;
            }
        }
        return false ;
    } 
    public static void main(String[] args) {
        head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = head.next;
        
       //   print();

        System.out.println(isCycle());
    }
}
