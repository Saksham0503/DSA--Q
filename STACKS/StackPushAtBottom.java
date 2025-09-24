package STACKS;
import java.util.* ;

public class StackPushAtBottom {

    public static void pushAtBottom (Stack <Integer> s ,int data){
        
        if(s.isEmpty()){      //base case
            s.push(data);
            return;
        }

        int top = s.pop();       //store the top value of stack in each step , then poping it out 
        pushAtBottom(s, data);       //doing recursion (calling out next step untill the stack is empty)
        s.push(top);   

    }
    public static void main(String[] args) {
        
        Stack <Integer> s  = new Stack <>();
        
        s.push(1);
        s.push(2);
        s.push(3);

        //calling the function 
        pushAtBottom(s, 4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
