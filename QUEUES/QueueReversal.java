package QUEUES;
import java.util.* ;
public class QueueReversal {
    
    public static void reverse (Queue <Integer> q){

        Stack <Integer> s = new Stack<>();  //stack creation

        while(!q.isEmpty()){       //put it in the stack
            s.push(q.remove());
        }

        while(!s.isEmpty()){       //again add it to queue 
            q.add(s.pop());        
        }
    }  

    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();     //queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        //calling the function 
        reverse(q);

        //printing in reverse
        while (!q.isEmpty()) {    
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
    
    }  
}
