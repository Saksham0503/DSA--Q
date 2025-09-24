package QUEUES;

public class QueueUsingARRAY {

    //  .....................QUEUE USING ARRAYS........................

    public static class Queue {     //this is a queue class 
         
        static int arr [];   //properties 
        static int size;
        static int rear;

        public Queue(int n){       //contructor
            arr = new int [n];
            size = n ;
            rear = -1 ;
        }

        public static boolean isEmpty(){   
            return rear == -1 ;         //if queue is empty
        }

        //add
        public static void add (int data){
            if( rear == size-1){   //full
               System.out.println("Queue is full");
               return;
            }
          
            rear = rear + 1;
            arr[rear] = data ;
        }

        //remove --> O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty ");
                return -1;
            }

            int front = arr[0];
            for(int i = 0 ; i < rear ; i++){    
                arr[i] = arr[i+1];     //keeps on shifting element to first position
            }
            rear = rear - 1;      //we are moving rear from last to first
            return front ;
        }

        //peek
        public static int peek(){

            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }

        public static void main(String[] args) {
            Queue q = new Queue(5);   //size of array
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
}
