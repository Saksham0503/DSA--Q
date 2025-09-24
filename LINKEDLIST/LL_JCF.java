package LINKEDLIST;
import java.util.LinkedList;
public class LL_JCF {
    public static void main(String[] args) {
        //creation
        LinkedList <Integer> ll = new LinkedList<>();

        //add
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        //printing
        System.out.println(ll);

        //remove
        ll.removeFirst();
        ll.removeLast();
        ll.removeLast();

        //print
        System.out.println(ll);
    }
}
