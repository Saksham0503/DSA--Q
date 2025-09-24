package QUEUES;
import java.util.*;
public class DequeJCF {
    public static void main(String[] args) {
        Deque <Integer> dq = new LinkedList<>();

        dq.addFirst(2);             //add first
        dq.addFirst(1);
        System.out.println(dq);

        dq.removeFirst();             //remove first
        System.out.println(dq);

        dq.addLast(3);              //add last
        dq.addLast(4);
        System.out.println(dq);

        dq.removeLast();              //remove last
        System.out.println(dq);

        System.out.println("first element : "+ dq.getFirst());          //get first
        System.out.println("last element : "+ dq.getLast());            //get last

        while (!dq.isEmpty()) {            
            System.out.println(dq.remove());
        }

    }
}
