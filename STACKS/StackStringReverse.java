package STACKS;

import java.util.*;
public class StackStringReverse {

    public static void reverseString (String str){
     
        Stack  <Character> s  = new Stack<>();

        for(int i = 0 ; i< str.length() ; i++){
            char ch = str.charAt(i);
            s.push(ch);
        }

        StringBuilder newStr = new StringBuilder("");
         
        while(!s.isEmpty()){
           char top = s.pop();   //storing the top element before poping it out
           newStr = newStr.append(top);   //adding the top element one after another untill the stack becomes empty
        }

        System.out.println(newStr);
    }

    
    public static void main(String[] args) {
        
        String str = "abc"; 
        reverseString(str);     //calling the function

    }
}
