package STACKS;
import java .util.*;

public class StackColFrame {
     
    public static void main(String[] args) {
        
        Stack <Integer> s = new Stack <>();

        //push 
        s.push(4);
        s.push(8);
        s.push(7);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }
        
    }
}
