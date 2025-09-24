package QUEUES;

public class QueueUsingLL {

    //.......................Queue using linkedlist.........................

    public static class Node{        //this is node class
        int data ;         //properties
        Node next ;

        public Node(int data){        //constructor
            this.data = data ;
            this.next = null ;
        }
    }
    
    public static class Queue {
        
        static Node head = null ;
        static Node tail = null ;
        
        public static boolean isEmpty(){
            return head == null && tail == null ;
        }

        //add
        public static void add (int data){
            //creation of node 
            Node newNode = new Node(data);
            
            if(isEmpty()){   
                head = tail = newNode ;
                return;
            }

            //link
            tail.next = newNode ;
            
            //new tail
            tail = newNode ;
        }

        //remove
        public static int remove (){

            if(isEmpty()){        //no elemnt is present
                System.out.println("Queue is empty ");
                return -1;
            }
            
            int front = head.data ;

            if(head == tail){           //single element is present 
               head = tail = null ;
            }else {
               head = head.next ;
            }

            return front ;
        }

        //peek
        public static int peek (){
            if(isEmpty()){
                System.out.println("Queue is empty !!");
                return -1;
            }

            return head.data ;
        }
    }

    public static void main(String[] args) {
        
        Queue q = new Queue();  //object creation
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
    }
}
