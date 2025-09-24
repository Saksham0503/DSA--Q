package LINKEDLIST;

public class LL_Basics {

    public static class Node {   //class Node 
        int data ;        //properties
        Node next ;

        public Node (int data){      //constructor
            this.data = data ;   
            this.next = null ;
        }
    }

    //add first
    public static void addFirst (int data){
        //creation of node
        Node newNode = new Node(data);
        size++;
        if(head == null){         //empty linkedlist
           head = tail = newNode ;
           return ;
        }

        //link
        newNode.next = head ;

        //new head 
        head = newNode ;

    }

    //add last
    public static void addLast (int data){
        //creation of node
        Node newNode = new Node(data);
        size++;
        if(head == null){          //empty linkedlist
          head = tail = newNode ;
          return ;
        }

        //link
        tail.next = newNode ;

        //new tail
        tail = newNode ;
    }

    //add in middle 
    public static void add (int idx , int data){
      //creation of node
      Node newNode = new Node(data);
      if(idx == 0){
         addFirst(data);
         return;
      }
      size++;
      
      Node temp = head ;
      int i = 0 ;
      while(i < idx-1){
        temp = temp.next ;
        i++ ;
      }

      //link
      newNode.next = temp.next;   //newNode ka next will point to temp ka next
      temp.next = newNode ;      //then temp ka next will point to newNode
      
    }
     
    //remove first
    public static int removeFirst(){
       
      if (size==0){
        System.out.println("ll is empty");
        return Integer.MAX_VALUE ;
      }
      if (size == 1){
        int val = head.data;
        head = tail = null ;
        size = 0 ;
        return val;
      }

      int val = head.data;
      head = head.next ;
      size-- ;
      return val ;
    }

    //remove last
    public static int removeLast(){

      if(size==0){
        System.out.println("ll is empty !!");
        return Integer.MAX_VALUE ;
      }
      if(size == 1){
         int val = head.data;
         head = tail = null;
         size = 0;
         return val ;
      }

      Node prev = head ;
      for (int i = 0 ; i < size-2 ; i++){
         prev = prev.next ;   
      }

      int val = prev.next.data;   
      prev.next = null ;  
      tail = prev ; 
      size-- ;

      return val ;
    }

    public static int iterativeSearch (int key){
     
      Node temp = head ;
      int i = 0 ;
      while(temp != null){

        if(temp.data == key){
           return i ;
        }
        
        temp= temp.next;
        i++ ;
      }

      return -1 ;            //key not found
    }

    //recursive approach
    public static int helper (Node head, int key){
      
      if(head == null){  //base case
        return -1;
      }
      if(head.data == key){
        return 0 ;
      }

      int idx = helper(head.next, key);  //recursive call
      if(idx == -1){
         return -1;
      }

      return idx+1;
    }

    public static int recursiveSearch (int key){
      return helper(head, key);
    }

    //reverse 
    public static void reverse(){

      Node curr = tail = head;    //3 variables --->  4steps
      Node prev= null;
      Node next;

      while(curr != null){
        next = curr.next ;  //next is current ka next
        curr.next = prev;   //now curr ka next will point to prev
        prev = curr;        // prev is updated to curr
        curr = next ;         //curr is updated to next
      }

      head = prev ;        //new head 
    }


    //print 
    public static void print (){
       Node temp = head ;
       if(head == null){
         System.out.println("ll is empty !");
       }
       
       while (temp != null) {
           System.out.print(temp.data + "-->");
           temp = temp.next ;
       }
       System.out.println("null");
    }

    public static Node head ;
    public static Node tail ;
    public static int size ;
  public static void main(String[] args) {
    
    LL_Basics ll = new LL_Basics () ;          //object creation
    ll.addFirst(1);       //adding in linkedlist 
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addLast(4);
    ll.addLast(5);

    ll.print();         //printing

    ll.add(2, 23);
    ll.print();        //printing 

    removeFirst();       //remove first
    ll.print();

    removeLast();      //remove last
    ll.print();

    iterativeSearch(23);      //Iterative Search
    System.out.println("key is at index : "+iterativeSearch(23));
    
    recursiveSearch(4);
    System.out.println("key is at index : "+ recursiveSearch(4));     //Recursive Search
  }
    
}