package STACKS;
public class StackBasics2 {
    
    //implementing Stack using Linked List
    public static class Node {
        int data;   //properties
        Node next ;  

        public Node(int data) {  //constructor function 
           this.data = data ;
           this.next = null ;
        }

       // public static Node head ;
       // public static Node tail ;
       // public static int size ;

    }

    //stack class
    public static class Stack {
        static Node head = null;

        public static boolean isEmpty(){
            return head == null ;
        }

        //push
        public static void push (int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode ;
                return;
            }
            newNode.next = head;
            head = newNode ;
            
        }

        //pop
        public static int pop (){
            if(isEmpty()){
                return  -1;
            }
            int top = head.data ;
            head = head.next ;
            return top ; 
        }

        //peek 
        public static int peek (){
            if(isEmpty()){
                return -1 ; 
            }

            return head.data ; 
        }
        
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
            
        }
        
      /// creating a stack  class 
     /// making object for stack class 
    /// performing all the functions of stack 
   /// stack has 3 functions : push , pop , peek
    }
}
