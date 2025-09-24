package QUEUES;
import java.util.* ;
public class QueueUsingDeque {

    public static class Queue {
       
       static  Deque <Integer> dq = new LinkedList<>();
        
        //add --> addLast
        public static void add(int data){
            dq.addLast(data);
        }

        //remove --> removeFirst
        public static int remove(){
            if(dq.isEmpty()){
                System.out.println("queue is empty ");
                return -1;
            }
            int val = dq.removeFirst();
            return val ;
        }

        //peek --> getFirst
        public static int peek(){
            if(dq.isEmpty()){
                System.out.println("queue is empty");
                return -1 ;
            }

            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();

        //add
        q.add(0);
        q.add(1);
        q.add(2);

        System.out.println("peek  : "+ q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
