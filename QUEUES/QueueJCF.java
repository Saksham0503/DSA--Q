package QUEUES;
import java.util.* ;
public class QueueJCF {
    public static void main(String[] args) {

//1.===>>  //queue using LL class ----------> QUEUE is implemented by LL & ArrayDeque class (because Queue is an interface)
       Queue <Integer> q = new LinkedList<>();

       //adding 
       q.add(0);
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);

       //*** : aise bhi print kr skte hain         
       System.out.println(q);

       //remove , print , peek
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();

        

//2.===>>  //queue using ArrayDeque class
        Queue <Integer> q1 = new ArrayDeque<>();

        //adding 
        q1.add(90);
        q1.add(91);
        q1.add(92);
        q1.add(93);
        q1.add(94);
        q1.add(95);

        //*** : aise bhi print kr skte
        System.out.println(q1);

        //print , remove , peek
        while(!q1.isEmpty()){
            System.out.print(q1.peek()+" ");
            q1.remove();
        }
        System.out.println();

        
     
    }
}
