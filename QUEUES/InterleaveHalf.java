package QUEUES;
import java.util.* ;
public class InterleaveHalf {           //even length

    public static void printInterHalf(Queue <Integer> q) {
        
        Queue <Integer> firstHalf = new LinkedList<>();
        int size = q.size();       //we will store the actual size of original array
        
        for (int i = 0 ; i < size/2 ; i++){
            firstHalf.add(q.remove());
        }

        //adding first half and second half into original queue one after other
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }

    }
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>(); 
        
        //add
        for (int i = 1; i <= 10 ; i++){
            q.add(i);
        }    
        
        //calling the function
        printInterHalf(q);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
    }
}
