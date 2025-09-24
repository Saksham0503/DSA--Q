package QUEUES;

public class CircularQueue {

    public static class Queue {     //this is a queue class
        static int arr [] ;       //properties
        static int size ;  
        static int rear ;
        static int front ;

        public Queue (int n){       //constructor 
            arr = new int [n];
            size = n ;
            rear = -1 ;
            front = -1 ;
        }

        public static boolean isEmpty (){            //queue is empty
            return rear == -1 && front == -1 ;
        }

        public static boolean isFull (){           //queue is full
            return (rear+1)%size == front ;
        }

        //add  --> 
        public static void add (int data){

            if(isFull()){  
                System.out.println("Queue is full");
                return ;
            }
             
            if(front == -1){
               front = 0 ;
            }
            rear = (rear + 1)%size ;
            arr[rear] = data ;
        }

        //remove  -- > O(1)
        public static int remove (){
           if(isEmpty()){
             System.out.println("Queue is empty ");
             return -1 ;
           }
           
           int result = arr[front];
           
           if(front == rear){
                front = rear = -1 ;
           }else{
                front = (front + 1)%size;
           }
           
           return result ;

        }

        //peek
        public static int peek (){

            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1 ;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        
        Queue q = new Queue(4);       //object creation
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove());
        q.add(5);

        System.out.println(q.remove());
        q.add(6);
        
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
    }
}
