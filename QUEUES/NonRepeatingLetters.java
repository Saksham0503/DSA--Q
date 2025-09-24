package QUEUES;
import java.util.* ;
public class NonRepeatingLetters {

    public static void printNonRepeating (String str) {

        Queue <Character> q = new LinkedList<>();          //we will store the characters in it 
        int freq [] = new int[26];  //'a' to 'z'
        
        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);     
            q.add(ch);                   //we will add the current character into queue
            freq[ch - 'a']++;            //freq ko increase  ,  by 1 
            
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                 q.remove();      //front se remove kr denge
            }

            if(q.isEmpty()){                   // agar queue empty ho tb
                System.out.print(-1+" ");
            }else{                              //we will print the front 
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();    
    }
    public static void main(String[] args) {
        String str = "aabccxb";
         
        printNonRepeating(str);      //calling the function

    }
}
