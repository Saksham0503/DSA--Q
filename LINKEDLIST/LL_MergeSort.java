package LINKEDLIST;
public class LL_MergeSort{
    //creation 
    public static class Node {        //this is node class
       int data;           //properties
       Node next;          

       public Node(int data){       //constructor
         this.data = data;      
         this.next = null;
       }
    }

    public static Node head ;
    public static Node tail;
    public static int size ;

    //addFirst
    public static void addFirst(int data){
        //creation of new node
        Node newNode = new Node(data);
        if(head == null){ 
            head = tail = newNode ;
        }
        //link
        newNode.next = head;
        //new head
        head = newNode;
    }

    //addLast
    public static void addLast (int data){
        //creation of new node
        Node newNode = new Node( data);
        if(head == null){
            head = tail = newNode;
        }
        //link 
        tail.next = newNode ;
        //new tail
        tail = newNode ;
    }

    //print
    public static void print(){
        if (head == null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next ;
        }
        System.out.println("null");
    }
    
    //find the mid node
    public static Node findMid (Node head){
         Node slow = head;     
         Node fast = head.next;
         while(fast != null && fast.next != null){
             slow = slow.next ;    //+1
             fast = fast.next.next ;   //+2
         }
         return slow ;     //this is the mid Node 
    }

    //merge 
    public static Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);   //creating a new node with -1 as data
        Node temp = mergedLL ;

        while(head1 != null && head2 != null){   

            if(head1.data <= head2.data){    //we will merge only smallest elements   
                temp.next = head1;     //link
                head1 = head1.next;     //updating head
                temp = temp.next;      //updating temp
            }else{
                temp.next = head2;    //link
                head2 = head2.next;    //updating head 
                temp = temp.next;      //updating temp
            }
        }
        
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2 ;
            head2 = head2.next;
            temp = temp.next ;
        }

       return mergedLL.next ;   //we will remove -1 out of our linked list
    }

    //mergeSort
    public static Node mergeSort (Node head){

        if(head == null || head.next == null){  //ll is empty or ll has 1 node
            return head ;
        }

        //step 1 --> find the mid
        Node mid = findMid(head);

        //step 2 --> left and right merge sort
        Node right = mid.next ;
        mid.next = null ;

        Node newLeft = mergeSort(head);            //calling for next step 
        Node newRight = mergeSort(right);          //calling for next step
        
        //step 3 -- > merge
        return  merge(newLeft, newRight);     //merging 

    }

    public static void main(String[] args) {
       LL_MergeSort ll = new LL_MergeSort();
       ll.addFirst(1);
       ll.addFirst(5);
       ll.addLast(7);
       ll.addLast(3);
       ll.addFirst(6);

       ll.print();
       ll.head = ll.mergeSort(ll.head);
       ll.print();
    }
}