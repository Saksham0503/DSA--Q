package QUEUES;
import java.util.* ;
public class StackUsingDeque {

    static Deque <Integer> dq = new LinkedList<>();
    public static class Stack {
         //push
         public static void push (int data){
            dq.addLast(data);
         }

         //pop
         public static int pop(){
            if(dq.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int val = dq.removeLast();
            return val ;
         }

         //peek
         public static int peek(){
            if(dq.isEmpty()){
                System.out.println("stack is empty");{
                return -1;
                }
   
            }
            return dq.getLast();
         }
    }
    public static void main(String[] args) {
        Stack s = new Stack();   //object creation

        //push
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

       System.out.println("peek : "+s.peek());
       System.out.println(s.pop());
       System.out.println(s.pop());
       System.out.println(s.pop());
       System.out.println(s.pop());
       System.out.println(s.pop());
       System.out.println(s.pop());
    }
}
