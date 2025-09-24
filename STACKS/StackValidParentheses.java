package STACKS;
import java.util.*;
public class StackValidParentheses {

    public static boolean isValid (String str){
        Stack <Character> s = new Stack<>();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '('  ||  ch == '{'  ||  ch== '['){
                s.push(ch);
            }
            //closing
            else{
                if(s.isEmpty()){   // means no opening bracket is present before closing , the it is invalid
                    return false;
                }
                if( (s.peek()  == '(' && ch == ')')
                  ||( s.peek() == '{' && ch == '}')
                  || (s.peek() == '[' && ch == ']')){

                    s.pop(); 
                }else{
                    return false;
                }
            }
        }


        if(s.isEmpty()){   //after pairing of closing and opening , the stack becomes empty , means isValid
            return true;
        }else{
            return false;  //if any opening bracket has yet not found its pair , then it is invalid
        }
    }
    public static void main(String[] args) {
        
        String str = "({})[]";
        System.out.println(isValid(str));  //calling the function
    }
}
