package LINKEDLIST;

public class LL_ZigZag {

    public static class Node { // this is a node class
        int data; // properties
        Node next;

        public Node(int data) { // constructor
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public static void addFirst (int data){
        //creation of node
        Node newNode = new Node(data);
        if(head == null){
            head = tail =newNode;
            return;
        }
        //link
        newNode.next = head ;
        //new head
        head = newNode ;
    }

    //addLast
    public static void addLast (int data){
        //creation of node
        Node newNode = new Node (data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        //link 
        tail.next = newNode;
        //new tail 
        tail = newNode;
    }

    //print
    public static void print (){
        if (head == null){
            System.out.println("ll is empty ");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void zigZag(){
        //find mid node

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next ;      //+1
            fast = fast.next.next ;      //+2
        }
        Node mid = slow ;    //mid node 
        
        //reverse 2nd half

        Node prev = null;
        Node curr = mid.next;  //for 2nd half
        mid.next = null;  // 1st half is being separated from second half(i.e. two diff linkedlist)
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;    //link
            prev = curr;         //updation
            curr = next ;        //updation
        }

        Node leftHead = head;   //1st half
        Node rightHead = prev;   //2nd half
       
        Node nextL  , nextR  ;

        //alt merging
        while(leftHead != null  &&  rightHead != null){
            
             nextL = leftHead.next;    //nextL is left ke head ka next
             leftHead.next = rightHead;    //leftHead.next will point to rightHead
             nextR = rightHead.next;    //nextR is right ke head ka next
             rightHead.next = nextL;   //rightHead.next will point o nextL
        
             leftHead = nextL;    //NEWhead for left and right
             rightHead = nextR;   
        }

}
    public static void main(String[] args) {
        LL_ZigZag ll = new LL_ZigZag();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addFirst(0);

        ll.print();

        ll.zigZag();

        ll.print();
    }
}
